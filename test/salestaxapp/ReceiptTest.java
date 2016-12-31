/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestaxapp;

import salestaxapp.Receipt;
import salestaxapp.Item;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author achu
 */
public class ReceiptTest {
    
    Receipt receipt;
    ArrayList<Item> itemList;
    Item item1;
    Item item2;
    
    @Before
    public void setUp() {
        item1 = new Item("1 CD", 20.00, 4.0);
        item2 = new Item("1 book", 10.00, 0.0);
        itemList = new ArrayList<Item>();
        itemList.add(item1);
        itemList.add(item2);
        receipt = new Receipt(itemList);  
    }

    /**
     * Test of getTotalTax method, of class Receipt.
     */
    @Test
    public void testGetTotalTax() {
        double expResult = 4.0;
        double result = receipt.getTotalTax();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getGrandTotal method, of class Receipt.
     */
    @Test
    public void testGetGrandTotal() {
        double expResult = 34.0;
        double result = receipt.getGrandTotal();
        assertEquals(expResult, result, 0.0);
    }
    
}
