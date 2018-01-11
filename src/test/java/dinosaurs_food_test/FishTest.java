package dinosaurs_food_test;

import aquatic_dinosaurs.AqaticDinosaurs;
import dinosaurs_food.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {

    AqaticDinosaurs dinosaur;
    Fish fish;

    @Before
    public void before() {
        fish = new Fish();
    }


    @Test
    public void fishHasHealthValue() {
        assertEquals(100, fish.getHealthValue());
    }

}
