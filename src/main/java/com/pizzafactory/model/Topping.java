package com.pizzafactory.model;

public class Topping {
    private final String name;
    private final boolean isVeg;
    private final double price;

    public Topping(String name, boolean isVeg, double price) {
        this.name = name;
        this.isVeg = isVeg;
        this.price = price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
