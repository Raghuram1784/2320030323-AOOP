// File: PlaceOrderTest.java
package com.ordermanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlaceOrderTest {

    @Test
    void testPlaceOrder() {
        Order order = new Order("1", "Laptop", 2);
        PlaceOrder placeOrder = new PlaceOrder(order);
        placeOrder.execute();

        assertEquals("PLACED", order.getStatus());
    }
}
