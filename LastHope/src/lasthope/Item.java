/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasthope;
public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQty;

    public Item(String itemName, double itemPrice, int itemQty) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
    }

    public void setPrice(double price) {
        this.itemPrice = price;
    }

    public void addQty(int qty) {
        this.itemQty += qty;
    }

    public void removeQty(int qty) {
        this.itemQty -= qty;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQty() {
        return itemQty;
    }
}