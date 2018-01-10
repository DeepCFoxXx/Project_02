package dinosaurs_test.carnivorous_dinosaurs_test;

import carnivore_dionsaurs.Utahraptor;
import dinosaurs_food.Edible;
import dinosaurs_food.Pig;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtahraptorTest {

    Utahraptor utahraptor;
    Edible edible;

    @Before
    public void before() {
        utahraptor = new Utahraptor("Laura", 2, 4, 1000, "Carnivorous", 600);
    }

    @Test
    public void utahraptorHasName() {
        assertEquals("Laura", utahraptor.getName());
    }

    @Test
    public void utahraptorHasHeight() {
        assertEquals(2, utahraptor.getHeight());
    }

    @Test
    public void utahraptorHasLength() {
        assertEquals(4, utahraptor.getLength());
    }

    @Test
    public void utahraptorHasWeight() {
        assertEquals(1000, utahraptor.getWeight());
    }

    @Test
    public void utahraptorHasType() {
        assertEquals("Carnivorous", utahraptor.getType());
    }

    @Test
    public void utahraptorHasHealth() {
        assertEquals(600, utahraptor.getHealth());
    }

    @Test
    public void utahraptorCanTakeDamage() {
        utahraptor.takeDamage(50);
        assertEquals(550, utahraptor.getHealth());
    }

    @Test
    public void utahraptorCanFeed() {
        edible = new Pig();
        utahraptor.feed(150);
        assertEquals(750, utahraptor.getHealth());
    }

    @Test
    public void utahraptorHasDiscription() {
        assertEquals("Largest known member of raptor family.", utahraptor.getDiscription());
    }

    @Test
    public void utahraptorCanRage() {
        utahraptor.canRage();
        assertEquals(true, utahraptor.getRage() > 0);
    }

}
