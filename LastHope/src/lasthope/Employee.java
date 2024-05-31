
package lasthope;


public class Employee {
    private String name;
    private String ID;
    private Restaurant r;
    private int wage;

    public Employee(String name, String ID, Restaurant r, int wage) {
        this.name = name;
        this.ID = ID;
        this.r = r;
        this.wage = wage;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String generateID() {
        return "EMP" + this.ID;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    // Add more methods as needed
}