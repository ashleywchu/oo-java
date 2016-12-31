package salestaxapp;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author achu
 */
public class Printer {
    
    /* Formats price strings with leading zeros and two decimal places */
    DecimalFormat df = new DecimalFormat("0.00");

    /* Print the new receipt as a new String */
    public void printReceipt(Receipt receipt) {
        String newReceipt = "";
        ArrayList<Item> items = receipt.getAllItems();

        for(Item item : items) {
            Double newTotal = Util.round(item.getNewTotal());
            String newTotalAsString = df.format(newTotal);
            newReceipt += item.getItemName() + ": " + newTotalAsString + "\n";
        }

        String taxTotalAsString = df.format(receipt.getTotalTax());
        String grandTotalAsString = df.format(receipt.getGrandTotal());

        newReceipt += "Sales Taxes: " + taxTotalAsString + "\nTotal: " + grandTotalAsString;
        System.out.println(newReceipt);
    }    
}
