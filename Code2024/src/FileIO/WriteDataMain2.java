
package FileIO;

import java.io.File;
import java.io.PrintWriter;


public class WriteDataMain2 {
    
    
    public static void main(String[] args) throws Exception {
        
        String name[] = {"sakib ahmed", "rakib ahmed", "alaska zaman"};
          int id[] ={12336,2563,45589};
          File file = new File("write1.txt");
         
          PrintWriter output = new PrintWriter(file);
          
          for(int i=0; i<3; i++)
          {
          output.println(name[i] + " " + id[i]);
          }
          output.close();
          
         
    }
    
}
