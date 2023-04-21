package designPatterns.factory.factoryMethod.productClasses.concreteProducts;

import designPatterns.factory.abstractFactory.PizzaIngredientFactory;
import designPatterns.factory.abstractFactory.concreteFactories.NYPizzaIngredientFactory;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
