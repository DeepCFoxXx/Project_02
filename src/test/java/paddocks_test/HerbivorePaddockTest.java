package paddocks_test;

import herbivore_dinosaurs.HerbivoreDinosaur;
import herbivore_dinosaurs.Stegosaurus;
import org.junit.Before;
import org.junit.Test;
import paddocks.HerbivorePaddock;

import static org.junit.Assert.assertEquals;

public class HerbivorePaddockTest {

    HerbivorePaddock herbivorePaddock;
    HerbivorePaddock herbivorePaddock2;
    HerbivoreDinosaur herbivoreDionsaurs;

    @Before
    public void before() {
        herbivorePaddock = new HerbivorePaddock("Jurassic Herbivores", "Herbivore", 25500, 5000);
        herbivorePaddock2 = new HerbivorePaddock("Jurassic Herbivores", "Herbivore", 25500, 5000);
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

    @Test
    public void herbivorePaddockStartsEmpty() {
        assertEquals(0, herbivorePaddock.getCount());
    }

    @Test
    public void herbivorePaddockCanAdd() {
        herbivorePaddock.addToPaddock(herbivoreDionsaurs);
        assertEquals(1, herbivorePaddock.getCount());
    }

    @Test
    public void herbivorePaddockCanAddStegosaurus() {
        herbivoreDionsaurs = new Stegosaurus("Tom", 5, 7, 2800, "Herbivore", 1100);
        herbivorePaddock.addToPaddock(herbivoreDionsaurs);
        assertEquals(1, herbivorePaddock.getCount());
    }

    @Test
    public void herbivorePaddockCanRemove() {
        herbivorePaddock.addToPaddock(herbivoreDionsaurs);
        herbivorePaddock.removeFromPaddock(herbivoreDionsaurs);
        assertEquals(0, herbivorePaddock.getCount());
    }

    @Test
    public void canTransfer() {
        herbivoreDionsaurs = new Stegosaurus("Sara", 5, 8, 2900, "Herbivore", 1150);
        herbivorePaddock.addToPaddock(herbivoreDionsaurs);
        herbivorePaddock.transferToPaddock(herbivoreDionsaurs, herbivorePaddock2);
        assertEquals(1, herbivorePaddock2.getCount());
        assertEquals(0, herbivorePaddock.getCount());
    }

}
