
package lasthope;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Restaurant restaurant;

    public MainFrame(Restaurant restaurant) {
        this.restaurant = restaurant;
        setTitle("Restaurant Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        setContentPane(background);
        setLayout(new FlowLayout());

        JButton menuButton = new JButton("View Menu");
        JButton orderButton = new JButton("Place Order");
        JButton inventoryButton = new JButton("Inventory");
        JButton accountsButton = new JButton("Accounts");

        menuButton.addActionListener(e -> displayMenu());
        orderButton.addActionListener(e -> placeOrder());
        inventoryButton.addActionListener(e -> manageInventory());
        accountsButton.addActionListener(e -> manageAccounts());

        add(menuButton);
        add(orderButton);
        add(inventoryButton);
        add(accountsButton);

        setVisible(true);
    }

    private void displayMenu() {
        JOptionPane.showMessageDialog(this, restaurant.getMenu().displayMenu());
    }

    private void placeOrder() {
        // Implement order placement logic
    }

    private void manageInventory() {
        // Implement inventory management logic
    }

    private void manageAccounts() {
        // Implement accounts management logic
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("My Restaurant");
        new MainFrame(restaurant);
    }
}
