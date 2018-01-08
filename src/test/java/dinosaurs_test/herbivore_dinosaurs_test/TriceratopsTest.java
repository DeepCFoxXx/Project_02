package dinosaurs_test.herbivore_dinosaurs_test;

import herbivore_dinosaurs.Triceratops;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriceratopsTest {

    Triceratops triceratops;

    @Before
    public void before() {
        triceratops = new Triceratops("Becky", 3, 6, 5900, "Herbivore", 2000);
    }

    @Test
    public void triceratopsHasName() {
        assertEquals("Becky", triceratops.getName());
    }

    @Test
    public void triceratopsHasHeight() {
        assertEquals(3, triceratops.getHeight());
    }

    @Test
    public void triceratopsHasLength() {
        assertEquals(6, triceratops.getLength());
    }

    @Test
    public void triceratopsHasWeight() {
        assertEquals(5900, triceratops.getWeight());
    }

    @Test
    public void triceratopsHasType() {
        assertEquals("Herbivore", triceratops.getType());
    }

    @Test
    public void triceratopsHasHealth() {
        assertEquals(2000, triceratops.getHealth());
    }

    @Test
    public void triceratopsHasDiscription() {
        assertEquals("With its 3 horns, a parrot-like beak and a large frill that could reach nearly 1 metre (3 feet) across.", triceratops.getDiscription());
    }

}
