package dinosaur_attack_test;

import carnivore_dionsaurs.Allosaurus;
import dinosaur_attack.Swipe;
import dinosaurs.Dinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwipeTest {

    Swipe swipe;
    Dinosaur dinosaur;

    @Before
    public void before() {
      swipe = new Swipe();
      dinosaur = new Allosaurus("Robert", 2, 5, 550, "Carnivorous", 2000);
    }

    @Test
    public void canAttack() {
        swipe.attack(dinosaur);
        assertEquals(1800, dinosaur.getHealth());
    }

}
