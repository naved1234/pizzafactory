package com.pizzafactory.model;

public class Side {
    private final String name;
    private final double price;

    public Side(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
