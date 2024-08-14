// File: UpdateOrderTest.java
package com.ordermanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UpdateOrderTest {

    @Test
    void testUpdateOrder() {
        Order order = new Order("3", "Phone", 3);
        UpdateOrder updateOrder = new UpdateOrder(order, "Smartphone", 5);
        updateOrder.execute();

        assertEquals("Smartphone", order.getProduct());
        assertEquals(5, order.getQuantity());
        assertEquals("UPDATED", order.getStatus());
    }
}
