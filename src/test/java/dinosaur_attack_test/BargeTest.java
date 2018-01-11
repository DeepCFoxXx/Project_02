package dinosaur_attack_test;

import aquatic_dinosaurs.Plesiosaur;
import dinosaur_attack.Barge;
import dinosaurs.Dinosaur;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BargeTest {

    Barge barge;
    Dinosaur dinosaur;

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
}
