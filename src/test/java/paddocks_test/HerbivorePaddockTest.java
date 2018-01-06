package paddocks_test;

import org.junit.Before;
import org.junit.Test;
import paddocks.HerbivorePaddock;

import static org.junit.Assert.assertEquals;

public class HerbivorePaddockTest {

    HerbivorePaddock herbivorePaddock;

    @Before
    public void before() {
        herbivorePaddock = new HerbivorePaddock("Jurassic Herbivores", "Herbivore", 25500, 5000);
    }

    @Test
    public void aquaticPaddockHasName() {
        assertEquals("Jurassic Herbivores", herbivorePaddock.getName());
    }

    @Test
    public void aquaticPaddockHasType() {
        assertEquals("Herbivore", herbivorePaddock.getType());
    }

    @Test
    public void aquaticPaddockHasSize() {
        assertEquals(25500, herbivorePaddock.getSize());
    }

    @Test
    public void aquaticPaddockHasDefenseValue() {
        assertEquals(5000, herbivorePaddock.getDefenseValue());
    }
}
