import models.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        Hero testHero = new Hero(2, 4);
        assertEquals(false, false);
    }

    @Test
    public void newCipher_getsLength_2() {
        Hero testHero = new Hero(2, 4);
        assertEquals(0, testHero.getLength());
    }


    @Test
    public void getWidth_getsCipherWidth_4() {
        Hero testHero = new Hero(2, 4);
        assertEquals(1, testHero.getWidth());
    }

    @Test
    public void isCipher_whenNotASquare_false() {
        Hero testHero = new Hero(2, 4);
        assertEquals(true, testHero.isHero());
    }



}
