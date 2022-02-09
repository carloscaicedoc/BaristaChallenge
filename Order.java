import java.util.ArrayList;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    // Getters and Setters for NAME
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getters and Setters for READY
    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean ready){   
        this.ready = ready;
    }
    // Getters and Setters for ITEMS
    public ArrayList<Item> getItems(){
        return items;
    }
    public void setItems(ArrayList<Item> item) {
        this.items = items;
    }
     
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer's Name: %s\n", this.name);
        for (Item i: this.items) {
            System.out.println(i.getName() + " : $" + i.getPrice());
        } 
        System.out.println("Total: $" + this.getOrderTotal());
        System.out.println("************************************");

    }

}  
