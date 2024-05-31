
package lasthope;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    private LoginHandler loginHandler;

    public LoginFrame() {
        loginHandler = new LoginHandler();

        setTitle("Restaurant Management System - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        setContentPane(background);
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);

        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (loginHandler.login(username, password)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login Successful!");
                    new MainFrame(new Restaurant("My Restaurant"));
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Invalid credentials!");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (loginHandler.register(username, password)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Registration Successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Username already exists!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}