import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("Mocha", 5.50);
        Item item2 = new Item("Latte", 6.25);
        Item item3 = new Item("Drip Coffee", 3.25);
        Item item4 = new Item("Capuccino", 4.35);

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();
        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("June");
        Order order4 = new Order("Zoé");
        Order order5 = new Order("Mariette");

        // Implement the addItem method within the Order class
        // Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item3);
        order1.addItem(item4);

        order2.addItem(item2);
        order2.addItem(item2);
        order2.addItem(item3);

        order3.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);

        order4.addItem(item4);
        order4.addItem(item4);
        order4.addItem(item2);


        // Implement the getStatusMessage method within the Order class
        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        order2.setReady(false);
        System.out.println(order2.getStatusMessage());
        order3.setReady(false);
        System.out.println(order3.getStatusMessage());
        order4.setReady(true);
        System.out.println(order4.getStatusMessage());


        // Implement the getOrderTotal method within the Order class
        // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());


        // Implement the display method within the Order class
        // Finally, call the display method on all of your orders, like so: order3.display();
        order4.display();
        order3.display();
        order2.display();
        order1.display();
        
    }
}

