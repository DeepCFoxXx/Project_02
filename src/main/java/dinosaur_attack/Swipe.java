package dinosaur_attack;

import dinosaurs.Dinosaur;

public class Swipe implements IAttack{

  public void attack(Dinosaur dinosaur) {
      dinosaur.takeDamage(200);
  }

}
