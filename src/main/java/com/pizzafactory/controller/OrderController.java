package com.pizzafactory.controller;

import com.pizzafactory.model.Order;
import com.pizzafactory.service.OrderService;

public class OrderController {

    private final OrderService orderService;

    public OrderController() {
        this.orderService = new OrderService();
    }

    public void submitOrder(Order order) {
        try {
            orderService.placeOrder(order);
        } catch (RuntimeException e) {
            System.err.println("Failed to place order: " + e.getMessage());
        }
    }
}
