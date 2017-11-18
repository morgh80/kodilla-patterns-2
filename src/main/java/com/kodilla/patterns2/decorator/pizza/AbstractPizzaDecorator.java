package com.kodilla.patterns2.decorator.pizza;

public abstract class AbstractPizzaDecorator implements Pizza {
    private Pizza pizza;

    public AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }

    @Override
    public Double getCost() {
        return pizza.getCost();
    }
}
