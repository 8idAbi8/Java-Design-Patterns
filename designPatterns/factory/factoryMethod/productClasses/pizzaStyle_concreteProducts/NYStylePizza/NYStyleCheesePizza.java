package designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.NYStylePizza;

import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza() {
		
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}

}
