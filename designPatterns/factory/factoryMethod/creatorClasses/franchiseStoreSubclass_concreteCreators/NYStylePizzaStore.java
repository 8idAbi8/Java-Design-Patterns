package designPatterns.factory.factoryMethod.creatorClasses.franchiseStoreSubclass_concreteCreators;

import designPatterns.factory.factoryMethod.creatorClasses.superClass_abstractCreator.PizzaStore;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.NYStylePizza.NYStyleCheesePizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.NYStylePizza.NYStyleClamPizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.NYStylePizza.NYStylePepperoniPizza;
import designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.NYStylePizza.NYStyleVeggiePizza;

// usiamo extends perchè PizzaStore è una abstract class
public class NYStylePizzaStore extends PizzaStore {

	public NYStylePizzaStore() {
//		super();  // lo fa implicitamente anche se non lo scriviamo
	}


	// il metodo abstract createPizza di PizzaStore va sempre implementato dalle subclass
	@Override
	protected Pizza createPizza(String item) {
		
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
	}

}
