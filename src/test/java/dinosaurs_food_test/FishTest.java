package dinosaurs_food_test;

import aquatic_dinosaurs.Plesiosaur;
import dinosaurs_food.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {

    dinosaurs.Dinosaurs dinosaur;
    Fish fish;

    @Before
    public void before() {
        fish = new Fish();
        dinosaur = new Plesiosaur("Nessie", 1, 4, 450, "Aquatic", 500);
    }

    @Test
    public void fishHasHealthValue() {
        assertEquals(100, fish.getHealthValue());
    }

//    @Test
//    public void canFeed() {
//        dinosaur = new Plesiosaur("Nessie", 1, 4, 450, "Aquatic", 500);
//        fish = new Fish();
//        dinosaur.(fish);
//        assertEquals(600, dinosaur.getHealth());
//    }
}
