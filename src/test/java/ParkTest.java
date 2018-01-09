import org.junit.Before;
import org.junit.Test;
import paddocks.AquaticPaddock;
import paddocks.CarnivorePaddock;
import paddocks.HerbivorePaddock;
import paddocks.Paddocks;


import static org.junit.Assert.assertEquals;

public class ParkTest {

     Park park;
     Paddocks paddocks;
     AquaticPaddock aquaticPaddock;
     CarnivorePaddock carnivorePaddock;
     HerbivorePaddock herbivorePaddock;

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
}
