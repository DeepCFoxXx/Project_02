package dinosaurs_test.herbivore_dinosaurs_test;

import herbivore_dinosaurs.Stegosaurus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StegosaurusTest {

    Stegosaurus stegosaurus;

    @Before
    public void before() {
        stegosaurus = new Stegosaurus("Steve", 3, 7, 3100, "Herbivore");
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


}
