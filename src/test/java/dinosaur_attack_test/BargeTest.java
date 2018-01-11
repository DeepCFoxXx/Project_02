package dinosaur_attack_test;

import aquatic_dinosaurs.Plesiosaur;
import dinosaur_attack.Barge;
import dinosaur_attack.IAttack;
import dinosaurs.Dinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BargeTest {

    Barge barge;
    Dinosaur dinosaur;
    IAttack swipe;

    @Before
    public void before() {
        barge = new Barge();
        dinosaur = new Plesiosaur("John", 3, 7, 800, "Aqatic", 2000);
    }

    @Test
    public void canAttack() {
        barge.attack(dinosaur);
        assertEquals(1700, dinosaur.getHealth());
    }

    @Test
    public void plesiosaurHasName() {
        assertEquals("John", dinosaur.getName());
    }

    @Test
    public void plesiosaurHasHeight() {
        assertEquals(3, dinosaur.getHeight());
    }

    @Test
    public void plesiosaurHasLength() {
        assertEquals(7, dinosaur.getLength());
    }

    @Test
    public void plesiosaurHasWeight() {
        assertEquals(800, dinosaur.getWeight());
    }

    @Test
    public void plesiosaurHasType() {
        assertEquals("Aqatic", dinosaur.getType());
    }

    @Test
    public void plesiosaurHasHealth() {
        assertEquals(2000, dinosaur.getHealth());
    }

}
