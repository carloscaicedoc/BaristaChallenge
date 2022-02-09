import java.util.ArrayList;

public class Item {

    private String name;
    private double price;

    public Item(){}

    public Item (String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters for NAME
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters for PRICE
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}