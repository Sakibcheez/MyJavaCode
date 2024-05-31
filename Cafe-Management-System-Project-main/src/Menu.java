import java.util.ArrayList;

public class Menu {
    private String image;
    private String title;
    private double price;
    public Menu(String image,String title,double price){
        this.image=image;
        this.title=title;
        this.price=price;
    }
   public static ArrayList<Menu>menu(){
        ArrayList<Menu>menu=new ArrayList<>();
        menu.add(new Menu("images/latte.jpg","Latte",6.25));
        menu.add(new Menu("images/donut.jpg","Donut",7.5));
        menu.add(new Menu("images/Cake2.jpg","Cake",10));
        menu.add(new Menu("images/Cake3.jpg","Cake",8.55));
        menu.add(new Menu("images/coldCoffee2.jpg","Cold Coffee",5));
        menu.add(new Menu("images/coldCoffee3.jpg","Cold Coffee",1.22));
        menu.add(new Menu("images/pp.jpg","Cold Coffee",5));
        menu.add(new Menu("images/CupCake.jpg","Cup Cake",2.5));
        menu.add(new Menu("images/hotCoffee2.jpg","Hot Coffee",3.12));
        menu.add(new Menu("images/hotCoffee3.jpg","Hot Coffee",5));
        menu.add(new Menu("images/latte2.jpg","Latte",8.25));
        menu.add(new Menu("images/latte3.jpg","Latte",7.25));
        menu.add(new Menu("images/latte4.jpg","Latte",7.4));
        menu.add(new Menu("images/latte5.jpg","Latte",7.35));
        menu.add(new Menu("images/brownies.jpg","Brownies",2.5));


        return menu;
   }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
