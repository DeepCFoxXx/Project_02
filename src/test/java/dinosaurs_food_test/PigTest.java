package dinosaurs_food_test;

import dinosaurs_food.Pig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigTest {

    Pig pig;

    @Before
    public void before() {
        pig = new Pig();
    }

    @Test
    public void pigHasHealthVlaue() {
        assertEquals(150, pig.getHealthValue());
    }

}
