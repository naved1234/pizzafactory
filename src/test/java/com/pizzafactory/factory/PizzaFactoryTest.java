package com.pizzafactory.factory;

import com.pizzafactory.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    @Test
    void shouldReturnVegPizzaInstance() {
        Pizza pizza = PizzaFactory.createPizza(
                "Deluxe Veggie", Size.REGULAR, CrustType.CHEESE_BURST,
                List.of(new Topping("Paneer", true, 35)));

        assertTrue(pizza instanceof VegPizza);
    }

    @Test
    void shouldReturnNonVegPizzaInstance() {
        Pizza pizza = PizzaFactory.createPizza(
                "Chicken Tikka", Size.REGULAR, CrustType.CHEESE_BURST,
                List.of(new Topping("Chicken Tikka", false, 35)));

        assertTrue(pizza instanceof NonVegPizza);
    }
}