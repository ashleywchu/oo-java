package salestaxapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author achu
 */
public class Reader {

    /* Read text from file, parsed Items from each line, and set a receipt's allItems */
    public Receipt createReceiptFromFile(String filename){
        Receipt receipt = new Receipt();
        
        try {
            FileReader fr = new FileReader("receipts/" + filename);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<Item> items = new ArrayList<Item>();

            String str;

            while ((str = br.readLine()) != null) {
                items.add(parseItem(str));
            }

            receipt.setAllItems(items);

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
        return receipt;
    }
    
    /* Parse each item, and set itemName, price, and tax */
    public Item parseItem(String item) {
        Item parsedItem = new Item();
        Calculator calculator = new Calculator();
        
        String[] itemSplit = item.split(" at ");
        parsedItem.setItemName(itemSplit[0]);
        Double price = Double.parseDouble(itemSplit[1]);
        parsedItem.setPrice(price);
        calculator.setItemTax(parsedItem);

        return parsedItem;
    }
}
