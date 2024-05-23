/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;


import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Menu extends JFrame {
    private JList<String> menuList;
    private JButton orderButton;
    private DefaultListModel<String> listModel;

    private static final String[] menuItems = {
        "Burger", "Pizza", "Pasta", "Salad", "Soda"
    };

    public Menu() {
        setTitle("Restaurant Management System - Menu");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();
        for (String item : menuItems) {
            listModel.addElement(item);
        }

        menuList = new JList<>(listModel);
        menuList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(menuList);

        orderButton = new JButton("Take Order");
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                takeOrder();
            }
        });

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(orderButton);
        add(panel);

        setVisible(true);
    }

    private void takeOrder() {
        List<String> selectedItems = menuList.getSelectedValuesList();
        if (selectedItems.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select items to order", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new Order(selectedItems);
        }
    }
}