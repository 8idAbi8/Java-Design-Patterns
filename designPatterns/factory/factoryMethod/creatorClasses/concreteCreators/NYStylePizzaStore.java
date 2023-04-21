package designPatterns.factory.factoryMethod.creatorClasses.concreteCreators;

import designPatterns.factory.abstractFactory.concreteFactories.NYPizzaIngredientFactory;
import designPatterns.factory.factoryMethod.creatorClasses.abstractCreator.PizzaStore;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.CheesePizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.ClamPizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.PepperoniPizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.VeggiePizza;

// usiamo extends perchè PizzaStore è una abstract class
public class NYStylePizzaStore extends PizzaStore {



	// il metodo abstract createPizza di PizzaStore va sempre implementato dalle subclass
	@Override
	protected Pizza createPizza(String item) {

		Pizza pizza = null;

		/*The NY Store is composed with a NY pizza ingredient factory. 
		 * This will be used to produce the ingredients for all NY style pizzas.*/
		NYPizzaIngredientFactory nyPizzaIngredientFactory =
				new NYPizzaIngredientFactory();


		if (item.equals("cheese")) {
			pizza = new CheesePizza(nyPizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizza");

		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(nyPizzaIngredientFactory);
			pizza.setName("New York Style Veggie Pizza");

		} else if (item.equals("clam")) {
			pizza = new ClamPizza(nyPizzaIngredientFactory);
			pizza.setName("New York Style Clam Pizza");

		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(nyPizzaIngredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		} 

		return pizza;
	}

}
