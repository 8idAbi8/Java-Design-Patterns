package designPatterns.factory.factoryMethod.creatorClasses.franchiseStoreSubclass_concreteCreators;

import designPatterns.factory.factoryMethod.creatorClasses.superClass_abstractCreator.PizzaStore;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.ChicagoStylePizza.ChicagoStyleCheesePizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.ChicagoStylePizza.ChicagoStyleClamPizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.ChicagoStylePizza.ChicagoStylePepperoniPizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.ChicagoStylePizza.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

	
	@Override
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else 
			return null;
	}

}
