package com.teste.spring.testeSpring.model.pizza;

import com.teste.spring.testeSpring.util.PizzasEnum;

public interface BasePizzaFactory {
	public abstract Pizza createPizza(PizzasEnum type);
}
