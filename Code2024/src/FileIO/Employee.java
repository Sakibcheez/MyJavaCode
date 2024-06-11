
package FileIO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

    class SerializationExample {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 1),
            new Employee("Bob", 2),
            new Employee("Charlie", 3)
        };

        // Serialize objects
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            for (Employee employee : employees) {
                outputStream.writeObject(employee);
            }
            System.out.println("Objects serialized successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Deserialize objects
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            System.out.println("Reading objects from file:");
            while (true) {
                try {
                    Employee employee = (Employee) inputStream.readObject();
                    System.out.println("Name: " + employee.getName() + ", ID: " + employee.getId());
                } catch (EOFException e) {
                    break; // Reached end of file
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}