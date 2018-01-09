import paddocks.Paddocks;

import java.util.ArrayList;

public class Park {

    private String name;
    private ArrayList<Paddocks> paddocks;

    public Park(String name) {
        this.name = name;
        this.paddocks = new ArrayList<Paddocks>();
    }

    public String getName() {
       return this.name;
    }

}
