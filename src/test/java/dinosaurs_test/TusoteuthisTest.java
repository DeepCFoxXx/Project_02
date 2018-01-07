package dinosaurs_test;

import dinosaurs.aquatic_dinosaurs.Tusoteuthis;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TusoteuthisTest {

    Tusoteuthis tusoteuthis;

    @Before
    public void before() {
        tusoteuthis = new Tusoteuthis("Simon", 500, 8, 200, "Aquatic");
    }

    @Test
    public void tusoteuthisHasName() {
        assertEquals("Simon", tusoteuthis.getName());
    }

    @Test
    public void tusoteuthisHasHeight() {
        assertEquals(500, tusoteuthis.getHeight());
    }

    @Test
    public void tusoteuthisHasLength() {
        assertEquals(8, tusoteuthis.getLength());
    }

    @Test
    public void tusoteuthisHasWeight() {
        assertEquals(200, tusoteuthis.getWeight());
    }

    @Test
    public void tusoteuthisHasType() {
        assertEquals("Aquatic", tusoteuthis.getType());
    }

    @Test
    public void tusoteuthisHasDiscription() {
        assertEquals("Large ancestor of modern day giant squid, Eating habits included siphoning and drinking preys blood.", tusoteuthis.getDiscription());
    }

}
