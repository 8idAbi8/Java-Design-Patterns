package designPatterns.factory.abstractFactory;

import designPatterns.factory.factoryMethod.ingredientFamily.Cheese;
import designPatterns.factory.factoryMethod.ingredientFamily.Clams;
import designPatterns.factory.factoryMethod.ingredientFamily.Dough;
import designPatterns.factory.factoryMethod.ingredientFamily.Pepperoni;
import designPatterns.factory.factoryMethod.ingredientFamily.Sauce;
import designPatterns.factory.factoryMethod.ingredientFamily.Veggies;

/* Abstract Factory:
 * So how are you going to ensure each franchise is using quality ingredients? 
 * You’re going to build a factory that produces them and ships them to your franchises!
 * 
 * Defining an interface for the factory that is going to 
 * create all our ingredients:
 * */
public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
}
