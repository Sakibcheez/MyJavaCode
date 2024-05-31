
package test27;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Login extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JTextField txtNewUsername;
    private JPasswordField txtNewPassword;

    public Login() {
        initComponents();
    }

    public void initComponents() {
        setTitle("Kashundi Cafe");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new BorderLayout());

        // Set icon
        ImageIcon icon = new ImageIcon("path/to/your/kashundi.png"); // Provide the path to your icon file
        setIconImage(icon.getImage());

        JTabbedPane tabbedPane = new JTabbedPane();

        // Login Panel
        JPanel loginPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("path/to/your/pexels-apgpotr-683039.jpg"); // Provide the path to your background image
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        loginPanel.setLayout(new GridLayout(3, 2));
        loginPanel.setOpaque(false); // Ensure the panel is transparent so the background is visible

        loginPanel.add(new JLabel("Username:"));
        txtUsername = new JTextField();
        loginPanel.add(txtUsername);

        loginPanel.add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        loginPanel.add(txtPassword);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new LoginButtonListener());
        loginPanel.add(btnLogin);

        JButton btnSignup = new JButton("Signup");
        btnSignup.addActionListener(e -> tabbedPane.setSelectedIndex(1)); // Switch to the Signup tab
        loginPanel.add(btnSignup);

        tabbedPane.add("Login", loginPanel);

        // Registration Panel
        JPanel registerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("path/to/your/background.jpg"); // Provide the path to your background image
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        registerPanel.setLayout(new GridLayout(3, 2));
        registerPanel.setOpaque(false); // Ensure the panel is transparent so the background is visible

        registerPanel.add(new JLabel("New Username:"));
        txtNewUsername = new JTextField();
        registerPanel.add(txtNewUsername);

        registerPanel.add(new JLabel("New Password:"));
        txtNewPassword = new JPasswordField();
        registerPanel.add(txtNewPassword);

        JButton btnRegister = new JButton("Create New");
        btnRegister.addActionListener(new RegisterButtonListener());
        registerPanel.add(btnRegister);

        tabbedPane.add("Create New", registerPanel);

        add(tabbedPane, BorderLayout.CENTER);
    }

    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username or Password is missing.");
                return;
            }

            if (authenticate(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                // Proceed to the next part of the application
                dispose(); // Close the login window
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }

        private boolean authenticate(String username, String password) {
            try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
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

    private class RegisterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = txtNewUsername.getText();
            String password = new String(txtNewPassword.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "New Username or Password is missing.");
                return;
            }

            if (register(username, password)) {
                JOptionPane.showMessageDialog(null, "Registration successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed. Username may already be taken.");
            }
        }

        private boolean register(String username, String password) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
                writer.write(username + "," + password);
                writer.newLine();
                return true;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
