package com.kodilla.patterns2.decorator.pizza;

public class MarinaraDecorator extends AbstractPizzaDecorator {
    public MarinaraDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", seafood";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 12.50;
    }
}
