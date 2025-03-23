package com.pizzafactory.factory;

import com.pizzafactory.model.*;

import java.util.List;

public class PizzaFactory {

    public static Pizza createPizza(String name, Size size, CrustType crust, List<Topping> toppings) {
        double basePrice;

        // Price based on size
        switch (name) {
            case "Deluxe Veggie" -> basePrice = getPrice(size, 150, 200, 325);
            case "Cheese and Corn" -> basePrice = getPrice(size, 175, 375, 475);
            case "Paneer Tikka" -> basePrice = getPrice(size, 160, 290, 340);
            case "Non-Veg Supreme" -> basePrice = getPrice(size, 190, 325, 425);
            case "Chicken Tikka" -> basePrice = getPrice(size, 210, 370, 500);
            case "Pepper Barbecue Chicken" -> basePrice = getPrice(size, 220, 380, 525);
            default -> throw new IllegalArgumentException("Invalid pizza name: " + name);
        }

        // Determine type based on known names
        return switch (name) {
            case "Deluxe Veggie", "Cheese and Corn", "Paneer Tikka" ->
                    new VegPizza(name, size, crust, toppings, basePrice);
            case "Non-Veg Supreme", "Chicken Tikka", "Pepper Barbecue Chicken" ->
                    new NonVegPizza(name, size, crust, toppings, basePrice);
            default -> throw new IllegalArgumentException("Unknown pizza type: " + name);
        };
    }

    private static double getPrice(Size size, double regular, double medium, double large) {
        return switch (size) {
            case REGULAR -> regular;
            case MEDIUM -> medium;
            case LARGE -> large;
        };
    }
}
