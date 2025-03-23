package com.pizzafactory.model;

import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Size size;
    protected CrustType crust;
    protected List<Topping> toppings;
    protected double basePrice;

    public Pizza(String name, Size size, CrustType crust, List<Topping> toppings, double basePrice) {
        this.name = name;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.basePrice = basePrice;
    }

    public abstract boolean isVegetarian();

    public double calculatePrice() {
        double price = basePrice;
        if (size == Size.LARGE && toppings.size() <= 2) return price;
        for (Topping topping : toppings) {
            price += topping.getPrice();
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public CrustType getCrust() {
        return crust;
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}
