
package lasthope;


import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Employee> emp;
    private Menu menu;
    private final ArrayList<Inventory> inv;
    private ArrayList<Order> orders;

    public Restaurant(String name) {
        this.name = name;
        this.emp = new ArrayList<>();
        this.inv = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.menu = new Menu();
    }

    public ArrayList<Employee> getEmployee() {
        return emp;
    }

    public Menu getMenu() {
        return menu;
    }

    // Add more methods as needed
}