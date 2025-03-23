package com.pizzafactory;

import com.pizzafactory.controller.OrderController;
import com.pizzafactory.factory.PizzaFactory;
import com.pizzafactory.model.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to PizzaFactory");

        // Create Toppings
        Topping paneer = new Topping("Paneer", true, 35);
        Topping capsicum = new Topping("Capsicum", true, 25);

        // Create a pizza using the factory
        Pizza pizza = PizzaFactory.createPizza(
                "Deluxe Veggie",
                Size.LARGE,
                CrustType.CHEESE_BURST,
                List.of(paneer, capsicum)
        );

        // Add a side
        Side drink = new Side("Cold Drink", 55);

        // Create order
        Order order = new Order(List.of(pizza), List.of(drink));

        // Submit order through controller
        OrderController controller = new OrderController();
        controller.submitOrder(order);

        System.out.println("Thank you for ordering from PizzaFactory!");
    }
}
