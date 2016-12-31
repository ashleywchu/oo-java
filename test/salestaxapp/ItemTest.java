/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestaxapp;

import salestaxapp.Item;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author achu
 */
public class ItemTest {
    
    @Before
    public  void setUp() {
    }

    /**
     * Test of getIsExempt method, of class Item.
     */
    @Test
    public void testGetIsExemptTrue() {
        Item instance = new Item("book", 10.00, 0.00);
        boolean expResult = true;
        boolean result = instance.getIsExempt();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetIsExemptFalse() {
        Item instance = new Item("CD", 10.00, 0.00);
        boolean expResult = false;
        boolean result = instance.getIsExempt();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIsImported method, of class Item.
     */
    @Test
    public void testGetIsImportedTrue() {
        Item instance = new Item("imported book", 10.00, 0.00);
        boolean expResult = true;
        boolean result = instance.getIsImported();
        assertEquals(expResult, result);
    }
    
}
