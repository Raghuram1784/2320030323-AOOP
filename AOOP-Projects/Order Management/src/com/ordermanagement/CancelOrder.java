// File: CancelOrder.java
package com.ordermanagement;

public class CancelOrder implements Command {
    private Order order;

    public CancelOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.setStatus("CANCELLED");
        System.out.println("Order cancelled: " + order);
    }
}
