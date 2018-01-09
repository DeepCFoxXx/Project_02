package paddocks_test;

import herbivore_dinosaurs.HerbivoreDinosaur;
import herbivore_dinosaurs.Stegosaurus;
import herbivore_dinosaurs.Triceratops;
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
        herbivorePaddock2 = new HerbivorePaddock("Transfer Tank", "Herbivore", 20000, 200);
    }

    @Test
    public void herbivorePaddockHasName() {
        assertEquals("Jurassic Herbivores", herbivorePaddock.getName());
    }

    @Test
    public void herbivorePaddockHasType() {
        assertEquals("Herbivore", herbivorePaddock.getType());
    }

    @Test
    public void herbivorePaddockHasSize() {
        assertEquals(25500, herbivorePaddock.getSize());
    }

    @Test
    public void herbivorePaddockHasDefenseValue() {
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

    @Test
    public void herbivorePaddock2HasName() {
        assertEquals("Transfer Tank", herbivorePaddock2.getName());
    }

    @Test
    public void herbivorePaddock2HasType() {
        assertEquals("Herbivore", herbivorePaddock2.getType());
    }

    @Test
    public void herbivorePaddock2HasSize() {
        assertEquals(20000, herbivorePaddock2.getSize());
    }

    @Test
    public void herbivorePaddock2HasDefenseValue() {
        assertEquals(200, herbivorePaddock2.getDefenseValue());
    }

    @Test
    public void herbivorePaddock2StartsEmpty() {
        assertEquals(0, herbivorePaddock2.getCount());
    }

    @Test
    public void herbivorePaddock2CanAdd() {
        herbivorePaddock2.addToPaddock(herbivoreDionsaurs);
        assertEquals(1, herbivorePaddock2.getCount());
    }

    @Test
    public void herbivorePaddock2CanAddTriceratops() {
        herbivoreDionsaurs = new Triceratops("Mario", 3, 6, 4100, "Herbivore", 1700);
        herbivorePaddock2.addToPaddock(herbivoreDionsaurs);
        assertEquals(1, herbivorePaddock2.getCount());
    }

    @Test
    public void herbivorePaddock2CanRemove() {
        herbivorePaddock2.addToPaddock(herbivoreDionsaurs);
        herbivorePaddock2.removeFromPaddock(herbivoreDionsaurs);
        assertEquals(0, herbivorePaddock2.getCount());
    }

}
