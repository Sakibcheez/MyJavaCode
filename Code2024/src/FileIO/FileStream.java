
package FileIO;

import com.sun.jdi.Value;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileStream {
    
 
    public static void main(String[] args) throws IOException {
        File file = new File("temp.dat");
        
        try (FileOutputStream output = new FileOutputStream(file)) {
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }
        
        try (FileInputStream input = new FileInputStream(file)) {
            int value; 
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
    
}
