import carnivore_dionsaurs.CarnivorousDinosaurs;
import carnivore_dionsaurs.Utahraptor;
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
     Paddocks rageHouse;
     AquaticPaddock aquaticPaddock;
     CarnivorePaddock carnivorePaddock;
     HerbivorePaddock herbivorePaddock;


     @Before
     public void before() {
         park = new Park("Jurassic Park");
         paddocks = new AquaticPaddock("Water House", "Aqatic", 45500, 1000);
         paddocks = new CarnivorePaddock("Sand House", "Carnivore", 25500, 5000);
         paddocks = new HerbivorePaddock("Green House", "Herbivore", 22500, 4000);
         rageHouse = new CarnivorePaddock("Rage House", "Carnivore", 1000, 10000);
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
    public void rageListStartsEmpty() {
        assertEquals(0, rageHouse.getCount());
    }

//    @Test
//    public boolean parkCanCheckRage() {
//        dinosaur = new Utahraptor("Jamie", 1, 4, 500, "Carnivorous", 600);
//        park.addToPark();
//        assertEquals(1, park.getCount());
//
//// dinosaurs rage == true
//        if (rage == true) {
////         then move dinosaur from paddock to park ArrayList
//        } else if () {
////         do nothing
//        }
//    }


}
