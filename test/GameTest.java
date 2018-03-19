import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void canCreateANewGame() throws Exception {
        Game game = new Game();
        assertNotNull(game);
    }
}