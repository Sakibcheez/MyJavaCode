
package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class LoginGUI extends JFrame {
    private Map<String, User> users;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginGUI() {
        users = FileManager.readUsers();

        setTitle("Login System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginAction());
        panel.add(loginButton);

        JButton createButton = new JButton("Create Account");
        createButton.addActionListener(new CreateAccountAction());
        panel.add(createButton);

        JButton recoverButton = new JButton("Recover Password");
        recoverButton.addActionListener(new RecoverPasswordAction());
        panel.add(recoverButton);

        JButton changeButton = new JButton("Change Password");
        changeButton.addActionListener(new ChangePasswordAction());
        panel.add(changeButton);

        add(panel);

        setVisible(true);
    }

    private class LoginAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            User user = users.get(username);
            if (user != null && user.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }
    }

    private class CreateAccountAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (users.containsKey(username)) {
                JOptionPane.showMessageDialog(null, "Username already exists.");
            } else {
                users.put(username, new User(username, password));
                FileManager.saveUsers(users);
                JOptionPane.showMessageDialog(null, "Account created successfully!");
            }
        }
    }

    private class RecoverPasswordAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            User user = users.get(username);
            if (user != null) {
                JOptionPane.showMessageDialog(null, "Your password is: " + user.getPassword());
            } else {
                JOptionPane.showMessageDialog(null, "Username not found.");
            }
        }
    }

    private class ChangePasswordAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            User user = users.get(username);
            if (user != null) {
                String newPassword = JOptionPane.showInputDialog("Enter new password:");
                if (newPassword != null && !newPassword.isEmpty()) {
                    user.setPassword(newPassword);
                    FileManager.saveUsers(users);
                    JOptionPane.showMessageDialog(null, "Password changed successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Password change cancelled.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username.");
            }
        }
    }
}
