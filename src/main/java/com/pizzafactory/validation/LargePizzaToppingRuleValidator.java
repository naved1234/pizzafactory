package com.pizzafactory.validation;

import com.pizzafactory.model.Pizza;
import com.pizzafactory.model.Size;

public class LargePizzaToppingRuleValidator implements BusinessRuleValidator {

    @Override
    public void validate(Pizza pizza) {
        if (pizza.getSize() == Size.LARGE && pizza.getToppings().size() > 2) {
            System.out.println("Large pizzas allow 2 toppings free. Additional toppings may incur extra cost.");
        }
    }
}
