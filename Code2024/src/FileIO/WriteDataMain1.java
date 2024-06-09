
package FileIO;

import java.io.File;
import java.io.PrintWriter;


public class WriteDataMain1 {
    
    public static void main(String[] args) {
        
        String name[] = {"sakib ahmed", "rakib ahmed", "alaska zaman"};
          int id[] ={12336,2563,45589};
          File file = new File("write.txt");
          try{
          
          PrintWriter output = new PrintWriter(file);
          
          for(int i=0; i<3; i++)
          {
          output.println(name[i]);
          output.println(id[i]);
          }
          output.close();
          }
          catch(Exception e)
          {
          e.printStackTrace();
          }
    }
    
}
