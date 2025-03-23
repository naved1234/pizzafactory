package com.pizzafactory.service;

import com.pizzafactory.model.Order;
import com.pizzafactory.model.Pizza;
import com.pizzafactory.validation.*;

import java.util.Arrays;
import java.util.List;

public class OrderService {

    private final InventoryService inventoryService = new InventoryService();

    // Injecting all validators here (Strategy Pattern)
    private final List<BusinessRuleValidator> validators = Arrays.asList(
            new VegToppingRuleValidator(),
            new NonVegToppingRuleValidator(),
            new CrustRuleValidator(),
            new LargePizzaToppingRuleValidator()
    );

    public void placeOrder(Order order) {
        System.out.println("Validating order...");

        for (Pizza pizza : order.getPizzas()) {
            for (BusinessRuleValidator validator : validators) {
                validator.validate(pizza);
            }
        }

        if (!inventoryService.isInventoryAvailable()) {
            throw new RuntimeException("Inventory not available. Cannot place order.");
        }

        inventoryService.consumeInventory();

        double total = order.calculateTotal();
        System.out.println("Order placed successfully!");
        System.out.println("Total amount: Rs. " + total);
    }
}
