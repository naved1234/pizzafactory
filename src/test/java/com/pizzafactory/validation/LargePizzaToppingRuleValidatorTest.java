package com.pizzafactory.validation;

import com.pizzafactory.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class LargePizzaToppingRuleValidatorTest {

    @Test
    void shouldAllowUpToTwoFreeToppings() {
        Pizza pizza = new VegPizza(
                "Deluxe Veggie",
                Size.LARGE,
                CrustType.CHEESE_BURST,
                List.of(
                        new Topping("Capsicum", true, 25),
                        new Topping("Mushroom", true, 30)
                ),
                325
        );

        new LargePizzaToppingRuleValidator().validate(pizza); // Should pass
    }

    @Test
    void shouldPrintWarningForMoreThanTwoToppings() {
        Pizza pizza = new VegPizza(
                "Deluxe Veggie",
                Size.LARGE,
                CrustType.CHEESE_BURST,
                List.of(
                        new Topping("Capsicum", true, 25),
                        new Topping("Mushroom", true, 30),
                        new Topping("Paneer", true, 35)
                ),
                325
        );

        new LargePizzaToppingRuleValidator().validate(pizza); // Just prints a message
    }
}
