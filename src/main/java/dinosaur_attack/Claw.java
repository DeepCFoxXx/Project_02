package dinosaur_attack;

import dinosaurs.Dinosaur;

public class Claw implements IAttack {

    public void attack(Dinosaur dinosaur) {
        dinosaur.takeDamage(350);
    }

}
