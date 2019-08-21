package com.teste.spring.testeSpring.model.pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
