package com.pizzafactory.validation;

import com.pizzafactory.model.Pizza;

public class CrustRuleValidator implements BusinessRuleValidator {

    @Override
    public void validate(Pizza pizza) {
        if (pizza.getCrust() == null) {
            throw new RuntimeException("A crust type must be selected.");
        }
    }
}
