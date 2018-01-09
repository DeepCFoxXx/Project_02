package paddocks_test;

import carnivore_dionsaurs.CarnivorousDinosaurs;
import carnivore_dionsaurs.Utahraptor;
import org.junit.Before;
import org.junit.Test;
import paddocks.CarnivorePaddock;

import static org.junit.Assert.assertEquals;

public class CarnivorePaddockTest {

    CarnivorePaddock carnivorePaddock;
    CarnivorousDinosaurs carnivorousDinosaurs;

    @Before
    public void before() {
        carnivorePaddock = new CarnivorePaddock("Jurassic Carnivores", "Carnivorous", 25500, 5000);
    }

    @Test
    public void carnivorePaddockHasName() {
        assertEquals("Jurassic Carnivores", carnivorePaddock.getName());
    }

    @Test
    public void carnivorePaddockHasType() {
        assertEquals("Carnivorous", carnivorePaddock.getType());
    }

    @Test
    public void carnivorePaddockHasSize() {
        assertEquals(25500, carnivorePaddock.getSize());
    }

    @Test
    public void carnivorePaddockHasDefenseValue() {
        assertEquals(5000, carnivorePaddock.getDefenseValue());
    }

    @Test
    public void carnivorePaddockStartsEmpty() {
        assertEquals(0, carnivorePaddock.getCount());
    }

    @Test
    public void carnivorePaddockcanAdd() {
        carnivorePaddock.addToPaddock(carnivorousDinosaurs);
        assertEquals(1, carnivorePaddock.getCount());
    }

    @Test
    public void carnivorePaddockCanAddUtahraptor() {
        carnivorousDinosaurs = new Utahraptor("Frank", 2, 5, 1000, "Carnivorous", 600);
        carnivorePaddock.addToPaddock(carnivorousDinosaurs);
        assertEquals(1, carnivorePaddock.getCount());
    }

    @Test
    public void carnivorePaddockCanRemove() {
        carnivorePaddock.addToPaddock(carnivorousDinosaurs);
        carnivorePaddock.removeFromPaddock(carnivorousDinosaurs);
        assertEquals(0, carnivorePaddock.getCount());
    }

}

