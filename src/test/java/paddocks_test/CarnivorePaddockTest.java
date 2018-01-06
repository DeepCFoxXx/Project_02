package paddocks_test;

import org.junit.Before;
import org.junit.Test;
import paddocks.CarnivorePaddock;

import static org.junit.Assert.assertEquals;

public class CarnivorePaddockTest {

    CarnivorePaddock carnivorePaddock;

    @Before
    public void before() {
        carnivorePaddock = new CarnivorePaddock("Jurassic Carnivores", "Carnivorous", 25500, 5000);
    }

    @Test
    public void aquaticPaddockHasName() {
        assertEquals("Jurassic Carnivores", carnivorePaddock.getName());
    }

    @Test
    public void aquaticPaddockHasType() {
        assertEquals("Carnivorous", carnivorePaddock.getType());
    }

    @Test
    public void aquaticPaddockHasSize() {
        assertEquals(25500, carnivorePaddock.getSize());
    }

    @Test
    public void aquaticPaddockHasDefenseValue() {
        assertEquals(5000, carnivorePaddock.getDefenseValue());
    }

}

