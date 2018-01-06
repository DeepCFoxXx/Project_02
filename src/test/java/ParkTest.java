import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParkTest {

     Park park;
//     Paddocks paddocks;

     @Before
     public void before() {
         park = new Park("Jurassic Park");
     }

     @Test
     public void parkHasName() {
         assertEquals("Jurassic Park", park.getName());
     }
}
