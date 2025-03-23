package com.pizzafactory.validation;

import com.pizzafactory.model.Pizza;
import com.pizzafactory.model.Topping;

public class NonVegToppingRuleValidator implements BusinessRuleValidator {

    @Override
    public void validate(Pizza pizza) {
        if (!pizza.isVegetarian()) {
            long nonVegCount = pizza.getToppings().stream().filter(t -> !t.isVeg()).count();
            boolean hasPaneer = pizza.getToppings().stream()
                    .anyMatch(t -> t.getName().equalsIgnoreCase("Paneer"));

            if (nonVegCount > 1) {
                throw new RuntimeException("Only one non-veg topping allowed for non-vegetarian pizzas.");
            }

            if (hasPaneer) {
                throw new RuntimeException("Non-vegetarian pizza cannot have paneer topping.");
            }
        }
    }
}
