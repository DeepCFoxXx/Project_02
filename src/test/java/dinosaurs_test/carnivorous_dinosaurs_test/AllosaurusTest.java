package dinosaurs_test.carnivorous_dinosaurs_test;

import carnivore_dionsaurs.Allosaurus;
import dinosaurs_food.Edible;
import dinosaurs_food.Pig;
import herbivore_dinosaurs.Stegosaurus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllosaurusTest {

    Allosaurus allosaurus;
    Edible edible;

    @Before
    public void before() {
        allosaurus = new Allosaurus("Pablo", 2, 7, 1600, "Carnivorous", 700);
    }

    @Test
    public void allosaurusHasName() {
        assertEquals("Pablo", allosaurus.getName());
    }

    @Test
    public void allosaurusHasHeight() {
        assertEquals(2, allosaurus.getHeight());
    }

    @Test
    public void allosaurusHasLength() {
        assertEquals(7, allosaurus.getLength());
    }

    @Test
    public void allosaurusHasWeight() {
        assertEquals(1600, allosaurus.getWeight());
    }

    @Test
    public void allosaurusHasType() {
        assertEquals("Carnivorous", allosaurus.getType());
    }

    @Test
    public void allosaurusHasHealth() {
        assertEquals(700, allosaurus.getHealth());
    }

    @Test
    public void allosaurusCanTakeDamage() {
        allosaurus.takeDamage(50);
        assertEquals(650, allosaurus.getHealth());
    }

    @Test
    public void allosaurusCanFeed() {
        edible = new Pig();
        allosaurus.feed(150);
        assertEquals(850, allosaurus.getHealth());
    }

    @Test
    public void allosaurusHasDiscription() {
        assertEquals("The name Allosaurus means different lizard.", allosaurus.getDiscription());
    }

    @Test
    public void allosaurusCanRage() {
        allosaurus.canRage();
        assertEquals(true, allosaurus.getRage() > 0);
    }
}
