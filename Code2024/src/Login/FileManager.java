
package Login;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileManager {
    private static final String FILE_NAME = "users.txt";

    public static Map<String, User> readUsers() {
        Map<String, User> users = new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            users = (Map<String, User>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Ignore, file will be created when saving users
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void saveUsers(Map<String, User> users) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}