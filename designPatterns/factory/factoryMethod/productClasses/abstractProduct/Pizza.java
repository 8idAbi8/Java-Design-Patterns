package designPatterns.factory.factoryMethod.productClasses.abstractProduct;

import java.util.ArrayList;

// all the concrete pizzas will derive from this class
public abstract class Pizza {

	//	Each Pizza has a name, a type of dough, a type of sauce, and a set of toppings.
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<>();


	public void prepare() {
		System.out.println("--- Preparing " + name + " ---");
		System.out.println("Tossing dough..." + dough);
		System.out.println("Adding sauce..." + sauce);
		System.out.println("Adding toppings: ");
		
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}

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
	
}
