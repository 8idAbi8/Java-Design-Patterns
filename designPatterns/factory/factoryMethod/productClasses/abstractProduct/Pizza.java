package designPatterns.factory.factoryMethod.productClasses.abstractProduct;

import java.util.Arrays;

import designPatterns.factory.factoryMethod.ingredientFamily.Cheese;
import designPatterns.factory.factoryMethod.ingredientFamily.Clams;
import designPatterns.factory.factoryMethod.ingredientFamily.Dough;
import designPatterns.factory.factoryMethod.ingredientFamily.Pepperoni;
import designPatterns.factory.factoryMethod.ingredientFamily.Sauce;
import designPatterns.factory.factoryMethod.ingredientFamily.Veggies;

// all the concrete pizzas will derive from this class
public abstract class Pizza {

	//	Each Pizza has a name, a type of dough, a type of sauce, and a set of toppings.
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;

	/* This is where we are going to collect the ingredients needed 
	 * for the pizza, which will come from the ingredient factory.*/
	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 15 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies)
				+ ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", clam=" + clam + "]";
	}
	
	

}
