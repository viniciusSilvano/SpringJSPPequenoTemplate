package com.teste.spring.testeSpring.model.pizza;

public interface Pizza {
	public abstract void addIngredients();
	
	public default void bakePizza() {
		System.out.println("Pizza baked at 400 for 20 minutes.");
	}
}
