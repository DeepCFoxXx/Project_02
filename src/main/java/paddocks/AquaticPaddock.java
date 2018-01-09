package paddocks;

import aquatic_dinosaurs.AqaticDinosaurs;

import java.util.ArrayList;

public class AquaticPaddock extends Paddocks{

    private ArrayList<AqaticDinosaurs> aqaticPaddock;

    public AquaticPaddock(String name, String type, int size, int defenseValue){
        super(name, type, size, defenseValue);
        this.aqaticPaddock = new ArrayList<AqaticDinosaurs>();
    }

    public int getCount() {
        return this.aqaticPaddock.size();
    }

    public void addToPaddock(AqaticDinosaurs aqaticDinosaurs) {
        this.aqaticPaddock.add(aqaticDinosaurs);
    }

    public void removeFromPaddock(AqaticDinosaurs aqaticDinosaurs) {
        this.aqaticPaddock.remove(aqaticDinosaurs);
    }
}
