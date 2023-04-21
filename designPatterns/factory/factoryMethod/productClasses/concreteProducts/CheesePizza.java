package designPatterns.factory.factoryMethod.productClasses.concreteProducts;

import designPatterns.factory.abstractFactory.PizzaIngredientFactory;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
		
 /* We need a factory to provide the ingredients. So each Pizza class 
  * gets a factory passed into its constructor  */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
