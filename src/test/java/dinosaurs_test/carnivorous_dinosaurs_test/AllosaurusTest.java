package dinosaurs_test.carnivorous_dinosaurs_test;

import carnivore_dionsaurs.Allosaurus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllosaurusTest {

    Allosaurus allosaurus;

    @Before
    public void before() {
        allosaurus = new Allosaurus("Pablo", 2, 7, 1600, "Carnivorous");
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
}