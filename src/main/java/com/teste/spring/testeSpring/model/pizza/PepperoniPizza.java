package com.teste.spring.testeSpring.model.pizza;

public class PepperoniPizza implements Pizza{
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
