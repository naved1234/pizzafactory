package com.pizzafactory.model;

import java.util.List;

public class NonVegPizza extends Pizza {

    public NonVegPizza(String name, Size size, CrustType crust, List<Topping> toppings, double basePrice) {
        super(name, size, crust, toppings, basePrice);
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }
}
