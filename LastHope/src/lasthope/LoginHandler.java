
package lasthope;

import java.util.HashMap;
import java.util.Map;

public class LoginHandler {
    private Map<String, String> credentials;

    public LoginHandler() {
        credentials = new HashMap<>();
        // Load credentials from a file or database
    }

    public boolean login(String username, String password) {
        return credentials.containsKey(username) && credentials.get(username).equals(password);
    }

    public boolean register(String username, String password) {
        if (credentials.containsKey(username)) {
            return false;
        }
        credentials.put(username, password);
        // Save credentials to a file or database
        return true;
    }
}
