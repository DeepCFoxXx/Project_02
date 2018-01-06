package paddocks_test;

import org.junit.Before;
import paddocks.AquaticPaddock;

public class AquaticPaddockTest {

    AquaticPaddock aquaticPaddock;

    @Before
    public void before() {
        aquaticPaddock = new AquaticPaddock("Jurassic Sea World", "Aquatic", 45460.9, 1000);
    }
}
