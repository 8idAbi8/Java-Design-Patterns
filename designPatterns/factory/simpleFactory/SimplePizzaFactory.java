package designPatterns.factory.simpleFactory;

import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.NYStylePizza.NYStyleCheesePizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.NYStylePizza.NYStyleClamPizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.NYStylePizza.NYStylePepperoniPizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.NYStylePizza.NYStyleVeggiePizza;

/*
 * The Simple Factory isn’t actually a Design Pattern; it’s more of a programming idiom.
 * But it is commonly used, so we’ll give it a Head First Pattern Honorable Mention.
 * */

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		/*
		 * 
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else 
			return null;
			
		 */
		return null;
	}

	

}
