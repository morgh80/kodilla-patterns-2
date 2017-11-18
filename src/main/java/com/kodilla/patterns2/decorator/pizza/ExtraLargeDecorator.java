package com.kodilla.patterns2.decorator.pizza;

public class ExtraLargeDecorator extends AbstractPizzaDecorator {
    public ExtraLargeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "+ extra large";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 8.0;
    }
}
