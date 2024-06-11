
package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationMain {
    
    public static void main(String[] args) throws Exception {
        
        Student_lab15 obj1 = new Student_lab15("Amir Ahmed", 1425555);
        Student_lab15 obj2 = new Student_lab15("Siyam Ahmed", 1555555);
        
        File file = new File("Object.dat");
        
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file)))
        {
        output.writeObject(obj1);
        output.writeObject(obj1);
        }
        
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(file)))
        {
        Student_lab15 s1 = (Student_lab15)input.readObject();
        Student_lab15 s2 = (Student_lab15)input.readObject();
        
            System.out.println(s1.toString());
            System.out.println(s2.toString());
        
        }

        
    }
    
}
