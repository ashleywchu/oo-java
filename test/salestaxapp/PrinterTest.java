package salestaxapp;

import salestaxapp.Receipt;
import salestaxapp.Printer;
import salestaxapp.Item;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author achu
 */
public class PrinterTest {
    
    Receipt receipt;
    ArrayList<Item> itemList;
    Item item1;
    Item item2;
    
    @Before
    public void setUp() {
        item1 = new Item("1 CD", 20.00, 4.00);
        item2 = new Item("1 book", 10.00, 0.00);
        itemList = new ArrayList<Item>();
        itemList.add(item1);
        itemList.add(item2);
        receipt = new Receipt(itemList);  
    }

    /**
     * Test of printReceipt method, of class Printer.
     */
    @Test
    public void testPrintReceipt() {
        Printer instance = new Printer();
        
        PrintStream oldContent = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        instance.printReceipt(receipt);
        System.setOut(oldContent);
        String output = new String(outContent.toByteArray());
        assertTrue(output.contains("Sales Taxes:"));
    }
    
}
