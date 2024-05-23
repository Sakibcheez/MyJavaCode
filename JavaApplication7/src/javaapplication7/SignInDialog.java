
package javaapplication7;


import javax.swing.*;
import java.awt.event.*;

public class SignInDialog extends JDialog {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInButton;
    private Login parent;

    public SignInDialog(Login parent) {
        super(parent, "Sign In", true);
        this.parent = parent;
        setSize(300, 200);
        setLocationRelativeTo(parent);
        
        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
        
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("New User:");
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

        signInButton = new JButton("Sign In");
        signInButton.setBounds(100, 80, 80, 25);
        panel.add(signInButton);

        signInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });
    }

    private void register() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        parent.registerUser(username, password);
        dispose();
    }
}