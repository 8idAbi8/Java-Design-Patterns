package designPatterns.factory.abstractFactory;

import designPatterns.factory.factoryMethod.ingredientFamily.Cheese;
import designPatterns.factory.factoryMethod.ingredientFamily.Clams;
import designPatterns.factory.factoryMethod.ingredientFamily.Dough;
import designPatterns.factory.factoryMethod.ingredientFamily.Pepperoni;
import designPatterns.factory.factoryMethod.ingredientFamily.Sauce;
import designPatterns.factory.factoryMethod.ingredientFamily.Veggies;

/* The Abstract Factory Pattern provides an interface for creating 
 * families of related or dependent objects without specifying their concrete classes.
 * 
 * */
public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
}
