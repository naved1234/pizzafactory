package com.pizzafactory.service;

import com.pizzafactory.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void shouldPlaceOrderSuccessfullyWhenValid() {
        Pizza pizza = new VegPizza("Deluxe Veggie", Size.MEDIUM, CrustType.NEW_HAND_TOSSED,
                List.of(new Topping("Capsicum", true, 25)), 200);
        Order order = new Order(List.of(pizza), List.of(new Side("Cold Drink", 55)));

        OrderService orderService = new OrderService();
        assertDoesNotThrow(() -> orderService.placeOrder(order));
    }

    @Test
    void shouldFailOrderWithInvalidTopping() {
        Pizza pizza = new VegPizza("Deluxe Veggie", Size.MEDIUM, CrustType.NEW_HAND_TOSSED,
                List.of(new Topping("Chicken Tikka", false, 35)), 200);
        Order order = new Order(List.of(pizza), List.of());

        OrderService orderService = new OrderService();
        assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));
    }
}