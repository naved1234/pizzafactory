package com.pizzafactory.validation;

import com.pizzafactory.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class VegToppingRuleValidatorTest {

    @Test
    void shouldThrowErrorIfVegPizzaHasNonVegTopping() {
        Pizza vegPizza = new VegPizza(
                "Deluxe Veggie",
                Size.MEDIUM,
                CrustType.FRESH_PAN_PIZZA,
                List.of(new Topping("Chicken Tikka", false, 35)),
                200
        );

        VegToppingRuleValidator validator = new VegToppingRuleValidator();
        assertThrows(RuntimeException.class, () -> validator.validate(vegPizza));
    }

    @Test
    void shouldPassIfVegPizzaHasOnlyVegToppings() {
        Pizza vegPizza = new VegPizza(
                "Cheese and Corn",
                Size.REGULAR,
                CrustType.CHEESE_BURST,
                List.of(new Topping("Mushroom", true, 30)),
                175
        );

        new VegToppingRuleValidator().validate(vegPizza); // Should not throw
    }
}
