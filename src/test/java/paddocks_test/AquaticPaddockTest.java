package paddocks_test;

import org.junit.Before;
import org.junit.Test;
import paddocks.AquaticPaddock;

import static org.junit.Assert.assertEquals;

public class AquaticPaddockTest {

    AquaticPaddock aquaticPaddock;

    @Before
    public void before() {
        aquaticPaddock = new AquaticPaddock("Jurassic Sea World", "Aquatic", 45460.9, 1000);
    }

    @Test
    public void aquaticPaddockHasName() {
        assertEquals("Jurassic Sea World", aquaticPaddock.getName());
    }

    @Test
    public void aquaticPaddockHasType() {
        assertEquals("Aquatic", aquaticPaddock.getType());
    }
}
