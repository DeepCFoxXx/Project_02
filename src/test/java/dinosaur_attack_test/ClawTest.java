package dinosaur_attack_test;

import carnivore_dionsaurs.Utahraptor;
import dinosaur_attack.Claw;
import dinosaurs.Dinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClawTest {

    Claw claw;
    Dinosaur dinosaur;

    @Before
    public void before() {
        claw = new Claw();
        dinosaur = new Utahraptor("Jimmy", 2, 6, 1100, "Carnivorous", 2000);
    }

    @Test
    public void canAttack() {
        claw.attack(dinosaur);
        assertEquals(1650, dinosaur.getHealth());
    }

    @Test
    public void utahraptorHasName() {
        assertEquals("Jimmy", dinosaur.getName());
    }

    @Test
    public void utahraptorHasHeight() {
        assertEquals(2, dinosaur.getHeight());
    }

    @Test
    public void utahraptorHasLength() {
        assertEquals(6, dinosaur.getLength());
    }

    @Test
    public void utahraptorHasWeight() {
        assertEquals(1100, dinosaur.getWeight());
    }

    @Test
    public void utahraptorHasType() {
        assertEquals("Carnivorous", dinosaur.getType());
    }

    @Test
    public void utahraptorHasHealth() {
        assertEquals(2000, dinosaur.getHealth());
    }

}
