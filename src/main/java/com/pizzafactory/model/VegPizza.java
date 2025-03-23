package com.pizzafactory.model;

import java.util.List;

public class VegPizza extends Pizza {

    public VegPizza(String name, Size size, CrustType crust, List<Topping> toppings, double basePrice) {
        super(name, size, crust, toppings, basePrice);
    }

    @Override
    public boolean isVegetarian() {
        return true;
    }
}
