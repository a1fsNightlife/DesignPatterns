package com.designpatterns;

import com.designpatterns.patterns.decorator.Coffee;
import com.designpatterns.patterns.decorator.Espresso;
import com.designpatterns.patterns.decorator.WithMilk;
import com.designpatterns.patterns.decorator.WithSugar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {
	public static void main(String[] args) {

		Coffee espresso = new Espresso();
		printCoffee(espresso);

		espresso = new WithMilk(espresso);
		printCoffee(espresso);

		espresso = new WithSugar(espresso);
		espresso = new WithSugar(espresso);
		printCoffee(espresso);

	}

	private static void printCoffee(Coffee c) {
		System.out.println("Const: " + c.cost() + ", description: " + c.getDescription());
	}
}