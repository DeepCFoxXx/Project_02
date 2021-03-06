package dinosaurs_test.aqatic_dinosaurs_test;

import aquatic_dinosaurs.Plesiosaur;
import dinosaur_attack.IAttack;
import dinosaur_attack.Swipe;
import dinosaurs.Dinosaur;
import dinosaurs_food.Edible;
import dinosaurs_food.Fish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlesiosaurTest {

    Plesiosaur plesiosaur;
    Edible edible;
    IAttack swipe;
    Dinosaur dinosaur;

    @Before
    public void before() {
        plesiosaur = new Plesiosaur("Nessie", 1, 4, 450, "Aquatic", 500);
        swipe = new Swipe();
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
    public void plesiosaurHasHealth() {
        assertEquals(500, plesiosaur.getHealth());
    }

    @Test
    public void plesiosaurCanTakeDamage() {
        plesiosaur.takeDamage(50);
        assertEquals(450, plesiosaur.getHealth());
    }

    @Test
    public void plesiosaurCanFeed() {
        edible = new Fish();
        plesiosaur.feed(100);
        assertEquals(600, plesiosaur.getHealth());
    }

    @Test
    public void plesiosaurHasDiscription() {
        assertEquals("Plesiosaurs were an order of large carnivorous marine reptiles from 245 million years ago.", plesiosaur.getDiscription());
    }

    @Test
    public void plesiosaurCanRage() {
        plesiosaur.canRage();
        assertEquals(true, plesiosaur.getRage() > 0);
    }

//    @Test
//    public void plesiosaurCanAttack() {
//        swipe = new Swipe();
//        dinosaur = new Stegosaurus("Beverly", 5, 8, 3000, "Herbivore", 3000);
//        plesiosaur.attack(dinosaur);
//        assertEquals(2800, dinosaur.getHealth());
//    }

//    @Test
//    public void plesiosaurCanGetOut() {
//        plesiosaur.canGetOut();
//        assertEquals(true, plesiosaur.getOut());
//    }



}
