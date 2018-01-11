package dinosaurs_test.aqatic_dinosaurs_test;

import aquatic_dinosaurs.Tusoteuthis;
import dinosaur_attack.IAttack;
import dinosaurs.Dinosaur;
import dinosaurs_food.Edible;
import dinosaurs_food.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TusoteuthisTest {

    Tusoteuthis tusoteuthis;
    Edible edible;
    IAttack swipe;
    Dinosaur dinosaur;

    @Before
    public void before() {
        tusoteuthis = new Tusoteuthis("Simon", 500, 8, 200, "Aquatic", 300);
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
    public void tusoteuthisHasHealth() {
        assertEquals(300, tusoteuthis.getHealth());
    }

    @Test
    public void tusoteuthisCanTakeDamage() {
        tusoteuthis.takeDamage(50);
        assertEquals(250, tusoteuthis.getHealth());
    }

    @Test
    public void tusoteuthisCanFeed() {
        edible = new Fish();
        tusoteuthis.feed(100);
        assertEquals(400, tusoteuthis.getHealth());
    }

    @Test
    public void tusoteuthisHasDiscription() {
        assertEquals("Large ancestor of modern day giant squid, Eating habits included siphoning and drinking preys blood.", tusoteuthis.getDiscription());
    }

    @Test
    public void tusoteuthisCanRage() {
        tusoteuthis.canRage();
        assertEquals(true, tusoteuthis.getRage() > 0);
    }

}
