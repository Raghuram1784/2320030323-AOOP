// File: UpdateOrder.java
package com.ordermanagement;

public class UpdateOrder implements Command {
    private Order order;
    private String newProduct;
    private int newQuantity;

    public UpdateOrder(Order order, String newProduct, int newQuantity) {
        this.order = order;
        this.newProduct = newProduct;
        this.newQuantity = newQuantity;
    }

    @Override
    public void execute() {
        order.setProduct(newProduct);
        order.setQuantity(newQuantity);
        order.setStatus("UPDATED");
        System.out.println("Order updated: " + order);
    }
}
