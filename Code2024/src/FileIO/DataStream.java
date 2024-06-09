
package FileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStream {
    
    public static void main(String[] args) throws IOException {
        File file = new File("temp1.dat"); 
        
        try(
        DataOutputStream output = new DataOutputStream(new FileOutputStream(file)); 
        )
        {
        output.writeUTF("Sajit");
        output.writeInt(24);
        output.writeDouble(50.5);
        }
        try(
        DataInputStream input = new DataInputStream(new FileInputStream(file));
        )
        {
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
        }
    }
}
