import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    Font font=new Font("family",Font.BOLD,15);
    JButton btnLogin,btnCancel,iconButton;
    JTextField txtUserName;
    JPasswordField passwordField;

    JLabel label;
   private boolean isVisible=false;

    public LoginFrame(){

        showFrame();
        this.setLayout(null);
        this.setBackground(Color.white);

        JLabel title=new JLabel("Tojan Cafe");
        title.setBounds(150,5,80,20);
        title.setFont(font);

        //username field

        JLabel userName=new JLabel("User Name");
        userName.setBounds(40,40,80,20);
        userName.setFont(font);

        txtUserName=new JTextField();
        txtUserName.setBounds(130,40,190,30);

        //password field

        JLabel password=new JLabel("Password");
        password.setBounds(40,80,80,20);
        password.setFont(font);

        passwordField=new JPasswordField();
        passwordField.setBounds(130,80,190,30);


        ImageIcon imageIcon=new ImageIcon("images/hideenI.png");
        iconButton=new JButton(imageIcon);
        iconButton.setBounds(325,80,50,30);
        iconButton.setFocusPainted(false);
        iconButton.setContentAreaFilled(false);
        iconButton.setBorderPainted(false);



        //Buttons

        btnLogin=new JButton("Login");
        btnLogin.setBounds(130,140,90,30);
        btnLogin.setFocusPainted(false);
        btnLogin.setBackground(Color.GREEN);
        btnLogin.setForeground(Color.white);

        btnCancel=new JButton("Cancel");
        btnCancel.setBounds(230,140,90,30);
        btnCancel.setFocusPainted(false);
        btnCancel.setBackground(Color.RED);
        btnCancel.setForeground(Color.white);

        label=new JLabel("");
        label.setForeground(Color.red);
        label.setBounds(150,180,180,20);




        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
        iconButton.addActionListener(this);



        this.add(txtUserName);
        this.add(password);
        this.add(iconButton);
        this.add(passwordField);
        this.add(btnCancel);
        this.add(btnLogin);
        this.add(userName);
        this.add(title);
        this.add(label);

        this.setVisible(true);




    }





    public void showFrame(){
        this.setTitle("Login");
        this.setSize(400,280);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(600,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogin){
            if(txtUserName.getText().equals("Admin")&&passwordField.getText().equals("123456789")){
                MainFrame mainFrame=new MainFrame();

                mainFrame.setVisible(true);
                dispose();
            }
            else if(txtUserName.getText().equals("Admin")){
                label.setText("Please enter a valid password ");
            }
            else {
                label.setText("Please enter a valid UserName ");
            }
        }
        else if(e.getSource()==iconButton){

          if(!isVisible) {
              iconButton.setIcon(new ImageIcon("images/showI.png"));
              passwordField.setEchoChar((char) 0);

          }
          else {
              iconButton.setIcon(new ImageIcon("images/hiddenI.png"));
              passwordField.setEchoChar('\u2022');
          }
          isVisible=!isVisible;

        }
        else if(e.getSource()==btnCancel){
            dispose();
        }
    }
}
