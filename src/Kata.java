public class Kata {
    private int score;
    private int lastRoll;
    private boolean hasSpare = false;
    private int hasStrike = 0;
    private int strikeAcc;
    private boolean frameBegin = true;

    public void roll(int pins) {
        if (hasSpare) {
            score += pins;
            hasSpare = false;
        }

        if (hasStrike != 0) {
            strikeAcc += pins;
            hasStrike--;
        }

        if (hasStrike == 0 && strikeAcc != 0) {
            score += 10 + strikeAcc * 2;
            strikeAcc = 0;
        }

        if (!frameBegin && lastRoll + pins == 10) {
            hasSpare = true;
        }

        if (pins == 10) {
            hasStrike = 2;
        }

        score += pins;
        lastRoll = pins;
        frameBegin = !frameBegin;
    }

    public int score() {
        return score;
    }
}
