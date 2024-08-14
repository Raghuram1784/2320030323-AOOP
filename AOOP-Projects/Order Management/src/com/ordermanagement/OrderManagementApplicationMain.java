// File: OrderManagementApplication.java
package com.ordermanagement;

public class OrderManagementApplicationMain {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order("1", "Laptop", 2);

        // Create an order processor
        OrderProcessor processor = new OrderProcessor();

        // Place the order
        Command placeOrder = new PlaceOrder(order);
        processor.executeCommand(placeOrder);

        // Update the order
        Command updateOrder = new UpdateOrder(order, "Smartphone", 5);
        processor.executeCommand(updateOrder);

        // Cancel the order
        Command cancelOrder = new CancelOrder(order);
        processor.executeCommand(cancelOrder);

        // Display command history
        System.out.println("\nCommand History:");
        for (Command cmd : processor.getCommandHistory()) {
            System.out.println(cmd);
        }
    }
}
