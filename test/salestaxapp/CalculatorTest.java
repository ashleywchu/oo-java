package salestaxapp;

import salestaxapp.Item;
import salestaxapp.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author achu
 */
public class CalculatorTest {

    Calculator calculator;
    Item item;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
        item = new Item("imported book", 10.00, 0.00);
    }
    /**
     * Test of runCalculator method, of class Calculator.
     */
    @Test
    public void testSetItemTax() {
        calculator.setItemTax(item);
        double expectedTax = 0.5;
        
        double actualTax = item.getTax();
        assertEquals(expectedTax, actualTax, 0.00);
    }

    
}
