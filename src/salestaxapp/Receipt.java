package salestaxapp;

import java.util.ArrayList;

/**
 *
 * @author achu
 */
public class Receipt {
    
    private ArrayList<Item> allItems;
    
    public Receipt () {
    }
    
    public Receipt(ArrayList<Item> items) {
        this.allItems = items;
    }
    
    public ArrayList<Item> getAllItems() {
        return allItems;
    }
    
    public void setAllItems(ArrayList<Item> itemList) {
        this.allItems = itemList;
    }
    
    public double getTotalTax() {
        Double totalTax = 0d;
        
        for(Item item : allItems) {
            totalTax += item.getTax();
        } 
        return totalTax;
    }
   
    public double getGrandTotal() {
        Double grandTotal = 0d;
        
        for(Item item: allItems) {
            double subTotal = item.getNewTotal();
            grandTotal += subTotal;
        }
        return grandTotal;
    }
    
}
