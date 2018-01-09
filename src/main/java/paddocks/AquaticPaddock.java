package paddocks;

import aquatic_dinosaurs.AqaticDinosaurs;

import java.util.ArrayList;

public class AquaticPaddock extends Paddocks{

    private ArrayList<AqaticDinosaurs> dinosaurs;

    public AquaticPaddock(String name, String type, int size, int defenseValue){
        super(name, type, size, defenseValue);
        this.dinosaurs = new ArrayList<AqaticDinosaurs>();
    }

    public int getCount() {
        return this.dinosaurs.size();
    }
}
