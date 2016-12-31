package salestaxapp;

/**
 *
 * @author achu
 */
public class Item {
    
    private String itemName;
    private double price;
    private double tax;
    private static final String[] TAXEXEMPTITEMS = new String[] {"chocolate", "chocolates", "book", "pills"};
    private static final String IMPORTED = "imported";
    
    public Item() {
    }
    
    public Item(String name, double price, double tax) {
        this.itemName = name;
        this.price = price;
        this.tax = tax;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public double getTax() {
        return tax;
    }
    
    public void setTax(Double tax) {
        this.tax = tax;
    } 
    
    public double getNewTotal() {
        return price + tax;
    }
    
    public boolean getIsExempt() {
        boolean isExempt = false;
        
        for(String exemptItem : TAXEXEMPTITEMS) {
            if(itemName.contains(exemptItem)) {
                isExempt = true;
            }
        }
        return isExempt; 
    }
    
    public boolean getIsImported() {
        boolean isImported = itemName.contains(IMPORTED);
        return isImported;
    }
}
