package paddocks;

import carnivore_dionsaurs.CarnivorousDinosaurs;

import java.util.ArrayList;

public class CarnivorePaddock extends Paddocks {

    private ArrayList<CarnivorousDinosaurs> dinosaurs;

    public CarnivorePaddock(String name, String type, int size, int defenseValue) {
        super(name, type, size, defenseValue);
        this.dinosaurs = new ArrayList<CarnivorousDinosaurs>();
    }

    public int getCount() {
        return this.dinosaurs.size();
    }
}
