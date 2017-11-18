package com.kodilla.patterns2.decorator.pizza;

public class ProsciuttoDecorator extends AbstractPizzaDecorator {
    public ProsciuttoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", prosciutto";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 5.0;
    }
}
