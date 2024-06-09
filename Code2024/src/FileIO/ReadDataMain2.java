
package FileIO;

import java.io.File;
import java.util.Scanner;

public class ReadDataMain2 {
    
    public static void main(String[] args) throws Exception {
        
    
      File file = new File ("name.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNext())
            {
                String name = input.nextLine();
                int id = input.nextInt();
                
                System.out.println("Name : "+name + "\tID: "+id);
                
                if(input.hasNext())
                    input.nextLine();
            }
            input.close();
        }
       
        
    }
     

