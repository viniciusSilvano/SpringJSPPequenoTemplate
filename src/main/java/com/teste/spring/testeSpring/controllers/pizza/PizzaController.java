package com.teste.spring.testeSpring.controllers.pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PizzaController {
	@RequestMapping(method = RequestMethod.GET, value = "/pizzas")
	public String getMethodName() {
		return "pizzas";
	}

}
