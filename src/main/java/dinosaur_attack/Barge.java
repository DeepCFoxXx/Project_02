package dinosaur_attack;

import dinosaurs.Dinosaur;

public class Barge implements IAttack {

    public void attack(Dinosaur dinosaur) {
        dinosaur.takeDamage(300);
    }

}
