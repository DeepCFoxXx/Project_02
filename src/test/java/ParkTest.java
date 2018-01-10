import dinosaurs.Dinosaur;
import org.junit.Before;
import org.junit.Test;
import paddocks.AquaticPaddock;
import paddocks.CarnivorePaddock;
import paddocks.HerbivorePaddock;
import paddocks.Paddocks;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParkTest {

     Park park;
     Paddocks paddocks;
     AquaticPaddock aquaticPaddock;
     CarnivorePaddock carnivorePaddock;
     HerbivorePaddock herbivorePaddock;
     Dinosaur dinosaur;

     @Before
     public void before() {
         park = new Park("Jurassic Park");
         paddocks = new AquaticPaddock("Water House", "Aqatic", 45500, 1000);
         paddocks = new CarnivorePaddock("Sand House", "Carnivore", 25500, 5000);
         paddocks = new HerbivorePaddock("Green House", "Herbivore", 22500, 4000);

     }

     @Test
     public void parkHasName() {
         assertEquals("Jurassic Park", park.getName());
     }

     @Test
     public void parksArrayListOfPaddocksStartsEmpty() {
         assertEquals(0, park.getCount());
     }

     @Test
     public void parkCanAdd() {
         park.addToPark(paddocks);
         assertEquals(1, park.getCount());
     }

     @Test
     public void parkCanAddAquaticPaddock() {
         paddocks = new AquaticPaddock("Water House", "Aqatic", 45500, 1000);
         park.addToPark(paddocks);
         assertEquals(1, park.getCount());
     }

     @Test
     public void parkCanRemove() {
         park.addToPark(paddocks);
         park.removeFromPark(paddocks);
         assertEquals(0, park.getCount());
     }

    @Test
    public void parkHasVisitors() {
        park.hasVisitors();
        assertEquals(true, park.getVisitors() > 0);
    }

    @Test
    public void parksArrayListOfDinosaurStartsEmpty() {
        assertEquals(0, park.getCount());
    }

//    @Test
//    public void parkArrayListCanAdd() {
//        park.addToPark(dinosaur);
//        assertEquals(1, park.getCount());
//    }

}
