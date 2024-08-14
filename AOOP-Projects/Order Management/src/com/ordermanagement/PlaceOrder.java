// File: PlaceOrder.java
package com.ordermanagement;

public class PlaceOrder implements Command {
    private Order order;

    public PlaceOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.setStatus("PLACED");
        System.out.println("Order placed: " + order);
    }
}
