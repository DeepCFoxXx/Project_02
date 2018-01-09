package dinosaurs_food_test;

import dinosaurs_food.Leaves;
import herbivore_dinosaurs.HerbivoreDionsaurs;
import herbivore_dinosaurs.Stegosaurus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeavesTest {

    HerbivoreDionsaurs dionsaur;
    Leaves leaves;

    @Before
    public void before() {
        leaves = new Leaves();
    }

    @Test
    public void leavesHasHealthValue() {
        assertEquals(15, leaves.getHelathValue());
    }

}