package com.pizzafactory.validation;

import com.pizzafactory.model.Pizza;
import com.pizzafactory.model.Topping;

public class VegToppingRuleValidator implements BusinessRuleValidator {

    @Override
    public void validate(Pizza pizza) {
        if (pizza.isVegetarian()) {
            for (Topping topping : pizza.getToppings()) {
                if (!topping.isVeg()) {
                    throw new RuntimeException("Vegetarian pizza cannot have non-vegetarian toppings.");
                }
            }
        }
    }
}
