package paddocks_test;

import carnivore_dionsaurs.Allosaurus;
import carnivore_dionsaurs.CarnivorousDinosaurs;
import carnivore_dionsaurs.Utahraptor;
import herbivore_dinosaurs.Stegosaurus;
import org.junit.Before;
import org.junit.Test;
import paddocks.CarnivorePaddock;

import static org.junit.Assert.assertEquals;

public class CarnivorePaddockTest {

    CarnivorePaddock carnivorePaddock;
    CarnivorePaddock carnivorePaddock2;
    CarnivorousDinosaurs carnivorousDinosaurs;

    @Before
    public void before() {
        carnivorePaddock = new CarnivorePaddock("Jurassic Carnivores", "Carnivorous", 25500, 5000);
        carnivorePaddock2 = new CarnivorePaddock("Transfer Tank", "Carnivorous", 20000,10000);
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

    @Test
    public void canTransferToPaddock2() {
        carnivorousDinosaurs = new Allosaurus("Sara", 5, 8, 2900, "Herbivore", 1150);
        carnivorePaddock.addToPaddock(carnivorousDinosaurs);
        carnivorePaddock.transferToPaddock(carnivorousDinosaurs, carnivorePaddock2);
        assertEquals(1, carnivorePaddock2.getCount());
        assertEquals(0, carnivorePaddock.getCount());
    }

}

