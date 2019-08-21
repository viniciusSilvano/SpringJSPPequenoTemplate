package com.teste.spring.testeSpring.model.pizza;

public class ChessePizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
