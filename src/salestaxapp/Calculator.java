package salestaxapp;

/**
 *
 * @author achu
 */

public class Calculator {
    
    /* Calculate item's sales and import tax and set the item's tax*/
    public void setItemTax(Item item){
        Double itemTaxTotal = 0d;
        
        if(item.getIsExempt() == false) {
            itemTaxTotal += applyBaseTax(item.getPrice());
        }
        if(item.getIsImported() == true) {
            itemTaxTotal += applyImportTax(item.getPrice());
        }
        
        item.setTax(Util.nearest5Percent(itemTaxTotal));
    }
    
    /* Multiply item price by 10% */
    private Double applyBaseTax(Double price) {
        return (price * 0.1);
    }
    
    /* Multiply item price by 5% */
    private Double applyImportTax(Double price) {
        return (price * 0.05);
    }
     
}
