
package javaapplication7;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signInButton;
    private static final String USER_DATA_FILE = "users.txt";
    private Map<String, String> users = new HashMap<>();
    
    public Login() {
        loadUserData();
        
        setTitle("Restaurant Management System - Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
        
        setVisible(true);
    }
    
    private void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);
        panel.add(usernameField);
        
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        
        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);
        
        loginButton = new JButton("Log In");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        
        signInButton = new JButton("Sign In");
        signInButton.setBounds(100, 80, 80, 25);
        panel.add(signInButton);
        
        JButton recoverButton = new JButton("Recover");
        recoverButton.setBounds(190, 80, 80, 25);
        panel.add(recoverButton);
        
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                authenticate();
            }
        });
        
        signInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SignInDialog(Login.this);
            }
        });
        
        recoverButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recoverPassword();
            }
        });
    }
    
    private void loadUserData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    users.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void saveUserData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_DATA_FILE))) {
            for (Map.Entry<String, String> entry : users.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void authenticate() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        if (users.containsKey(username) && users.get(username).equals(password)) {
            new Menu();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid login", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void recoverPassword() {
        String username = usernameField.getText();
        
        if (users.containsKey(username)) {
            JOptionPane.showMessageDialog(this, "Your password is: " + users.get(username), "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "User does not exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void registerUser(String username, String password) {
        if (users.containsKey(username)) {
            JOptionPane.showMessageDialog(this, "User already exists", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            users.put(username, password);
            saveUserData();
            JOptionPane.showMessageDialog(this, "Registration successful", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}


        


