// File: CancelOrderTest.java
package com.ordermanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CancelOrderTest {

    @Test
    void testCancelOrder() {
        Order order = new Order("2", "Tablet", 1);
        CancelOrder cancelOrder = new CancelOrder(order);
        cancelOrder.execute();

        assertEquals("CANCELLED", order.getStatus());
    }
}
