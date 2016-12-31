package salestaxapp;

import salestaxapp.Reader;
import salestaxapp.Item;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;


/**
 *
 * @author achu
 */
public class ReaderTest {

    String input;
       
    @Before
    public void setUp() {
        input = "book at 1";
    }

    /**
     * Test of parseReceipt method, of class Reader.
     */
    @Test
    public void testParseItem() {
        Reader instance = new Reader();        
        Item result = instance.parseItem(input);
        
        assertThat(result, instanceOf(Item.class));
    }
    
}
