package com.pizzafactory.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    @Test
    void shouldCalculateTotalCorrectlyWithSides() {
        Pizza pizza = new VegPizza("Deluxe Veggie", Size.MEDIUM, CrustType.NEW_HAND_TOSSED,
                List.of(new Topping("Capsicum", true, 25)), 200);
        Side side = new Side("Mousse Cake", 90);

        Order order = new Order(List.of(pizza), List.of(side));
        assertEquals(200 + 25 + 90, order.calculateTotal());
    }
}