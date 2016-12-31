package salestaxapp;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author achu
 */
public class Main {

    private static final String DIRECTORY = "./receipts";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        Printer printer = new Printer();
        Receipt receipt;
            
        ArrayList<String> filenames = Util.getFileNames(DIRECTORY);
        
        /* For each file, parse, create, and print a new receipt*/
        for(String filename : filenames) {
            receipt = reader.createReceiptFromFile(filename);
            printer.printReceipt(receipt);
        }
    }     
}
