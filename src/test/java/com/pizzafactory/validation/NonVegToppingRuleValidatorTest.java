package com.pizzafactory.validation;

import com.pizzafactory.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class NonVegToppingRuleValidatorTest {

    @Test
    void shouldThrowErrorIfMoreThanOneNonVegTopping() {
        Pizza nonVegPizza = new NonVegPizza(
                "Chicken Tikka",
                Size.MEDIUM,
                CrustType.NEW_HAND_TOSSED,
                List.of(
                        new Topping("Chicken Tikka", false, 35),
                        new Topping("Grilled Chicken", false, 40)
                ),
                370
        );

        assertThrows(RuntimeException.class, () -> new NonVegToppingRuleValidator().validate(nonVegPizza));
    }

    @Test
    void shouldThrowErrorIfNonVegPizzaHasPaneer() {
        Pizza nonVegPizza = new NonVegPizza(
                "Non-Veg Supreme",
                Size.LARGE,
                CrustType.WHEAT_THIN_CRUST,
                List.of(
                        new Topping("Chicken Tikka", false, 35),
                        new Topping("Paneer", true, 35)
                ),
                425
        );

        assertThrows(RuntimeException.class, () -> new NonVegToppingRuleValidator().validate(nonVegPizza));
    }

    @Test
    void shouldPassIfValidSingleNonVegTopping() {
        Pizza nonVegPizza = new NonVegPizza(
                "Pepper Barbecue Chicken",
                Size.REGULAR,
                CrustType.FRESH_PAN_PIZZA,
                List.of(new Topping("Grilled Chicken", false, 40)),
                220
        );

        new NonVegToppingRuleValidator().validate(nonVegPizza); // Should not throw
    }
}
