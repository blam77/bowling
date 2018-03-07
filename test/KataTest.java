import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class KataTest {

    private Kata kata;

    @Before
    public void setUp() throws Exception {
        kata = new Kata();
    }

    @Test
    public void iCanRollAllOnes() throws Exception {
        for(int i = 0; i < 20; i++) {
            kata.roll(1);
        }

        assertThat(kata.score(), equalTo(20));
    }

    @Test
    public void itCanCalculateSpare() throws Exception {
        kata.roll(6);
        kata.roll(4);

        kata.roll(2);
        kata.roll(3);

        assertThat(kata.score(), equalTo(17));
    }


    @Test
    public void itCanCalculateSpare_anytime() throws Exception {
        kata.roll(3);
        kata.roll(4);

        kata.roll(6);
        kata.roll(3);

        assertThat(kata.score(), equalTo(16));
    }

    @Test
    public void itCanCalculateStrikes() throws Exception {
        kata.roll(10);

        kata.roll(2);
        kata.roll(4);

        assertThat(kata.score(), equalTo(22));

    }
}
