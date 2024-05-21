
package FileIO;

import java.io.File;
import java.util.Date;


public class FileClass {
    
     public static void main(String[] args) 
    {
        File file = new File("new1.jpg");
        
        System.out.println("Does it exist? "+file.exists());
        System.out.println("The file has "+file.length()+" bytes");
        System.out.println("Can it be read? "+file.canRead());
        System.out.println("Can it be written? "+file.canWrite());
        System.out.println("Is it a directory? "+file.isDirectory());
        System.out.println("Is it a file? "+file.isFile());
        System.out.println("Is it absolute? "+file.isAbsolute());
        System.out.println("Is it hidden? "+file.isHidden());
        System.out.println("Absolute path is "+file.getAbsolutePath());
        System.out.println("Last modified on "+new Date(file.lastModified()));
    
    }
    
}
