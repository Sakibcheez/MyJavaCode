
package FileIO;

import java.io.File;
import java.io.FileWriter;




public class WriteDataMain3 {
    
    public static void main(String[] args) throws Exception {
        String name[] = {"sakib ahmed", "rakib ahmed", "alaska zaman"};
          int id[] ={12336,2563,45589};
          File file = new File("write2.txt");
         
        try (FileWriter fw = new FileWriter(file)) {
            for(int i=0; i<3; i++)
            {
                fw.write(name[i] + " " + id[i] + "\n");
            }
        }
          
         
    }
    
}
