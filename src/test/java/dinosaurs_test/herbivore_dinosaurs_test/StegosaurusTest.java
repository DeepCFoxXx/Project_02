package dinosaurs_test.herbivore_dinosaurs_test;

import dinosaurs_food.Edible;
import dinosaurs_food.Leaves;
import herbivore_dinosaurs.Stegosaurus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StegosaurusTest {

    Stegosaurus stegosaurus;
    Edible edible;

    @Before
    public void before() {
        stegosaurus = new Stegosaurus("Steve", 3, 7, 3100, "Herbivore", 1000);
    }

    @Test
    public void stegosaurusHasName() {
        assertEquals("Steve", stegosaurus.getName());
    }

    @Test
    public void stegosaurusHasHeight() {
        assertEquals(3, stegosaurus.getHeight());
    }

    @Test
    public void stegosaurusHasLength() {
        assertEquals(7, stegosaurus.getLength());
    }

    @Test
    public void stegosaurusHasWeight() {
        assertEquals(3100, stegosaurus.getWeight());
    }

    @Test
    public void stegosaurusHasType() {
        assertEquals("Herbivore", stegosaurus.getType());
    }

    @Test
    public void stegosaurusHasHealth() {
        assertEquals(1000, stegosaurus.getHealth());
    }

    @Test
    public void stegosaurusCanTakeDamage() {
        stegosaurus.takeDamage(50);
        assertEquals(950, stegosaurus.getHealth());
    }

    @Test
    public void stegosaurusCanFeed() {
        edible = new Leaves();
        stegosaurus.feed(15);
        assertEquals(1015, stegosaurus.getHealth());
    }

    @Test
    public void stegosaurusHasDiscription() {
        assertEquals("lived around 155 million years ago—during the Jurassic Period—in the Western portion of North America and parts of Europe.", stegosaurus.getDiscription());
    }


}
