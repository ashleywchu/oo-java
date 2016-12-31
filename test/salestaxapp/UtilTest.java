package salestaxapp;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author achu
 */
public class UtilTest {
    
    /**
     * Test of round method, of class Util.
     */
    @Test
    public void testRound() {
        Double value = 1.2705;
        Double expResult = 1.27;
        Double result = Util.round(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of nearest5Percent method, of class Util.
     */
    @Test
    public void testNearest5Percent() {
        Double value = 0.103;
        Double expResult = 0.15;
        Double result = Util.nearest5Percent(value);
        assertEquals(expResult, result);
    }
    
}
