
package test27;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class KashundiCafe extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField newUsernameField;
    private JPasswordField newPasswordField;
    private JLabel backgroundLabel;
    private JLabel logoLabel;
    private static final String DATA_FILE = "userData.txt";

    public KashundiCafe() {
        setTitle("Kashundi Cafe");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create background panel
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("pexels-apgpotr-683039.jpg");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new BoxLayout(backgroundPanel, BoxLayout.Y_AXIS));
        backgroundPanel.setOpaque(false);

        // Add logo
        logoLabel = new JLabel(new ImageIcon("logo.png"));
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        backgroundPanel.add(logoLabel);

        // Create login panel
        JPanel loginPanel = new JPanel();
        loginPanel.setOpaque(false);
        loginPanel.setLayout(new GridLayout(3, 2, 5, 5));

        loginPanel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        loginPanel.add(usernameField);

        loginPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        loginPanel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginAction());
        loginPanel.add(loginButton);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new SignUpAction());
        loginPanel.add(signUpButton);

        backgroundPanel.add(loginPanel);

        add(backgroundPanel, BorderLayout.CENTER);
    }

    private class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(KashundiCafe.this, "Username and Password are required.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (authenticate(username, password)) {
                JOptionPane.showMessageDialog(KashundiCafe.this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(KashundiCafe.this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private boolean authenticate(String username, String password) {
            try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(";");
                    if (parts[0].equals(username) && parts[1].equals(password)) {
                        return true;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return false;
        }
    }

    private class SignUpAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JDialog signUpDialog = new JDialog(KashundiCafe.this, "Sign Up", true);
            signUpDialog.setSize(300, 200);
            signUpDialog.setLayout(new GridLayout(3, 2, 5, 5));
            signUpDialog.setLocationRelativeTo(KashundiCafe.this);

            signUpDialog.add(new JLabel("New Username:"));
            newUsernameField = new JTextField();
            signUpDialog.add(newUsernameField);

            signUpDialog.add(new JLabel("New Password:"));
            newPasswordField = new JPasswordField();
            signUpDialog.add(newPasswordField);

            JButton submitButton = new JButton("Submit");
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String newUsername = newUsernameField.getText();
                    String newPassword = new String(newPasswordField.getPassword());

                    if (newUsername.isEmpty() || newPassword.isEmpty()) {
                        JOptionPane.showMessageDialog(signUpDialog, "Username and Password are required.", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    if (saveNewUser(newUsername, newPassword)) {
                        JOptionPane.showMessageDialog(signUpDialog, "Sign Up successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        signUpDialog.dispose();
                    } else {
                        JOptionPane.showMessageDialog(signUpDialog, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                private boolean saveNewUser(String username, String password) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE));
                         BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE, true))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] parts = line.split(";");
                            if (parts[0].equals(username)) {
                                return false;
                            }
                        }
                        writer.write(username + ";" + password);
                        writer.newLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    return true;
                }
            });
            signUpDialog.add(submitButton);
            signUpDialog.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KashundiCafe().setVisible(true);
            }
        });
    }
}