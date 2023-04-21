package designPatterns.factory.simpleFactory;

import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
//		orderPizza() method uses the simplefactory to create its pizzas by simply passing on the type of the order
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
