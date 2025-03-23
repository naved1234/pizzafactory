package com.pizzafactory.model;

import java.util.List;

public class Order {
    private final List<Pizza> pizzas;
    private final List<Side> sides;

    public Order(List<Pizza> pizzas, List<Side> sides) {
        this.pizzas = pizzas;
        this.sides = sides;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Side> getSides() {
        return sides;
    }

    public double calculateTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.calculatePrice();
        }
        for (Side side : sides) {
            total += side.getPrice();
        }
        return total;
    }
}
