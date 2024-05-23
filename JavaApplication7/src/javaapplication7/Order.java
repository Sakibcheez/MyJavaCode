/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import javax.swing.*;
import java.util.List;
import java.awt.event.*;

public class Order extends JFrame {
    private JTextArea orderDetails;
    private JButton generateBillButton;
    private List<String> items;

    public Order(List<String> items) {
        this.items = items;

        setTitle("Restaurant Management System - Order");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        orderDetails = new JTextArea();
        for (String item : items) {
            orderDetails.append(item + "\n");
        }

        generateBillButton = new JButton("Generate Bill");
        generateBillButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateBill();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(orderDetails));
        panel.add(generateBillButton);
        add(panel);

        setVisible(true);
    }

    private void generateBill() {
        // Assume each item costs $10 for simplicity
        double total = items.size() * 10;
        String billContent = "Order Details:\n" + orderDetails.getText() + "\nTotal: $" + total;
        Billing.generatePDF(billContent);
    }
}
