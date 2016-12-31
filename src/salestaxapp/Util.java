package salestaxapp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.File;
import java.util.ArrayList;


/**
 *
 * @author achu
 */
public class Util {
    
    private static File[] files;
    
    /* Get the filenames from the directory passed in */
    public static ArrayList<String> getFileNames(String target_dir) {
        File folder = new File(target_dir);
        files = folder.listFiles();
        
        ArrayList<String> filenames = new ArrayList<String>();

        if (files.length == 0) {
            System.out.println("The directory is empty. There are no receipts to read.");
        } else{
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    filenames.add(file.getName());
                }
            }
        }
        return filenames;
    }
    
    public static Double round(Double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public static Double nearest5Percent(Double value) {
        BigDecimal bd = new BigDecimal(Math.ceil(value * 20)/20);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
