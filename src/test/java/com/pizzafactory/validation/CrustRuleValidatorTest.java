package com.pizzafactory.validation;

import com.pizzafactory.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CrustRuleValidatorTest {

    @Test
    void shouldThrowIfCrustIsNotSelected() {
        Pizza pizza = new VegPizza(
                "Paneer Tikka",
                Size.REGULAR,
                null,
                List.of(new Topping("Paneer", true, 35)),
                160
        );

        assertThrows(RuntimeException.class, () -> new CrustRuleValidator().validate(pizza));
    }

    @Test
    void shouldPassIfCrustIsSelected() {
        Pizza pizza = new VegPizza(
                "Paneer Tikka",
                Size.REGULAR,
                CrustType.CHEESE_BURST,
                List.of(new Topping("Paneer", true, 35)),
                160
        );

        new CrustRuleValidator().validate(pizza); // Should not throw
    }
}
