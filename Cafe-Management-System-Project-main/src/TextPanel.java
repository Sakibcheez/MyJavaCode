import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TextPanel extends JPanel implements ActionListener{

    static JTextArea textArea;
    static double totalCost=0;
    JButton resetBtn,totalBtn,exitBtn;
    private static boolean isItemAdded=false;
    static JTextField  textField;
    Font font=new Font("Family",Font.BOLD,20);
    private JPanel CardsPanel;
    private MainFrame mainFrame;
    TextPanel(JPanel CardsPanel,MainFrame mainFrame){
        this.mainFrame=mainFrame;
        this.CardsPanel=CardsPanel;
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.setLayout(null);
        textArea=new JTextArea();
        textArea.setBounds(2,2,345,500);

        //To add the total amount

        JLabel total=new JLabel("Total($)");
        total.setBounds(20,530,100,30);
        total.setFont(font);

        textField=new JTextField();


        textField.setBounds(140,530,190,40);

        //The buttons
        totalBtn=new JButton("Total");
        totalBtn.setBounds(20,580,150,40);
        totalBtn.setFocusPainted(false);
        totalBtn.setForeground(Color.white);
        totalBtn.setBackground(Color.DARK_GRAY);

        resetBtn=new JButton("Reset");
        resetBtn.setBounds(180,580,150,40);
        resetBtn.setFocusPainted(false);
        resetBtn.setBackground(Color.DARK_GRAY);
        resetBtn.setForeground(Color.white);

        exitBtn=new JButton("Exit");
        exitBtn.setBounds(100,630,150,40);
        exitBtn.setFocusPainted(false);
        exitBtn.setBackground(Color.DARK_GRAY);
        exitBtn.setForeground(Color.white);




        totalBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        exitBtn.addActionListener(this);






        this.add(textField);
        this.add(totalBtn);
        this.add(resetBtn);
        this.add(exitBtn);
        this.add(total);
        this.add(textArea);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==totalBtn){
            textArea.append("****************************************************************************\n\nTotal Cost : "+totalCost+"\n\n"
            +"******************************Thank you***************************************");
        }
        else if(e.getSource()==resetBtn){
            textArea.setText("");
            totalCost=0.0;
            textField.setText("");
            isItemAdded=false;
            for (Component component : CardsPanel.getComponents()) {
                if (component instanceof CardPanel) {
                    CardPanel cardPanel = (CardPanel) component;
                    cardPanel.resetCheckBoxAndSpinner();
                }
            }


        }
        else if(e.getSource()==exitBtn){
            mainFrame.dispose();

        }
    }




    public static void viewCafe(String title,double price,String quantity){


        if(!isItemAdded) {
            textArea.setText("******************************Tojan Cafe******************************" + "\n" + "Purchase id:123456789" + "\n"
                    + "****************************************************************************\n"
                    + "  Item name :\tPrice($):\tQuantity:\n\n"
            );
            isItemAdded=true;
        }
        textField.setText(Double.toString(totalCost+=price*Integer.parseInt(quantity)));
        textArea.append("  " + title + "\t$" + price+"\t"+quantity+ "\n");

    }
    public static void removeItem(String title,double price,String quantity){
        textField.setText(Double.toString(totalCost-=price*Integer.parseInt(quantity)));
        textArea.setText(textArea.getText().replace("  " + title + "\t$" + price+"\t"+quantity+ "\n",""));
    }


}
