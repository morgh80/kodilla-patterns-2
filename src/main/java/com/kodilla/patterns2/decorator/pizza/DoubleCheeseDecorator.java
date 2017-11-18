package com.kodilla.patterns2.decorator.pizza;

public class DoubleCheeseDecorator extends AbstractPizzaDecorator {
    public DoubleCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", double cheese";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 5.0;
    }
}
