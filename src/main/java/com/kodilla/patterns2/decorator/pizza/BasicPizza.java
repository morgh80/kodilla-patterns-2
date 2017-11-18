package com.kodilla.patterns2.decorator.pizza;

public class BasicPizza implements Pizza {

    @Override
    public String getIngredients() {
        return "Tomato base, olive oil, origanum and garlic";
    }

    @Override
    public Double getCost() {
        return 19.00;
    }
}
