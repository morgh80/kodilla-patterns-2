package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

public class PizzaTestSuite {

    @Test
    public void shouldReturnBasicPizzaCost() {
        //Given
        Pizza pizza = new BasicPizza();
        //When
        Double cost = pizza.getCost();
        //Then
        assertEquals(new Double(19.00), cost);
    }

    @Test
    public void shouldReturnBasicPizzaIngredients() {
        //Given
        Pizza pizza = new BasicPizza();
        //When
        String ingredients = pizza.getIngredients();
        //Then
        assertEquals("Tomato base, olive oil, origanum and garlic", ingredients);
    }

    @Test
    public void shouldReturnMaxedOutPizzaCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new DoubleCheeseDecorator(pizza);
        pizza = new MarinaraDecorator(pizza);
        pizza = new ProsciuttoDecorator(pizza);
        pizza = new ExtraLargeDecorator(pizza);
        //When
        Double cost = pizza.getCost();
        //Then
        assertEquals(new Double(49.50), cost);
    }

    @Test
    public void shouldReturnMaxedOutIngredients() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new DoubleCheeseDecorator(pizza);
        pizza = new MarinaraDecorator(pizza);
        pizza = new ProsciuttoDecorator(pizza);
        //When
        String ingredients = pizza.getIngredients();
        //Then
        assertEquals("Tomato base, olive oil, origanum and garlic, double cheese, seafood, prosciutto", ingredients);
    }
}
