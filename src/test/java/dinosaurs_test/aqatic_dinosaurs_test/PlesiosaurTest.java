package dinosaurs_test.aqatic_dinosaurs_test;

import aquatic_dinosaurs.Plesiosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlesiosaurTest {

    Plesiosaur plesiosaur;

    @Before
    public void before() {
        plesiosaur = new Plesiosaur("Nessie", 1, 4, 450, "Aquatic");
    }

    @Test
    public void plesiosaurHasName() {
        assertEquals("Nessie", plesiosaur.getName());
    }

    @Test
    public void plesiosaurHasHeight() {
        assertEquals(1, plesiosaur.getHeight());
    }

    @Test
    public void plesiosaurHasLength() {
        assertEquals(4, plesiosaur.getLength());
    }

    @Test
    public void plesiosaurHasWeight() {
        assertEquals(450, plesiosaur.getWeight());
    }

    @Test
    public void plesiosaurHasType() {
        assertEquals("Aquatic", plesiosaur.getType());
    }

    @Test
    public void plesiosaurHasDiscription() {
        assertEquals("Plesiosaurs were an order of large carnivorous marine reptiles from 245 million years ago.", plesiosaur.getDiscription());
    }

}
