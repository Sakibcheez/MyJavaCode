/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasthope;


import java.util.ArrayList;

public class Menu {
    private ArrayList<Item> menuItem;

    public Menu() {
        this.menuItem = new ArrayList<>();
    }

    public Item findItem(String itemName) {
        for (Item item : menuItem) {
            if (item.getItemName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void addItem(Item item) {
        menuItem.add(item);
    }

    public void removeItem(Item item) {
        menuItem.remove(item);
    }

    public String displayMenu() {
        StringBuilder menuDisplay = new StringBuilder();
        for (Item item : menuItem) {
            menuDisplay.append(item.getItemName()).append(": ").append(item.getPrice()).append("\n");
        }
        return menuDisplay.toString();
    }
}
