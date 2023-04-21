package designPatterns.factory.abstractFactory.concreteFactories;

import designPatterns.factory.abstractFactory.PizzaIngredientFactory;
import designPatterns.factory.factoryMethod.ingredientFamily.Cheese;
import designPatterns.factory.factoryMethod.ingredientFamily.Clams;
import designPatterns.factory.factoryMethod.ingredientFamily.Dough;
import designPatterns.factory.factoryMethod.ingredientFamily.Pepperoni;
import designPatterns.factory.factoryMethod.ingredientFamily.Sauce;
import designPatterns.factory.factoryMethod.ingredientFamily.Veggies;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.FreshClams;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.Garlic;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.MarinaraSauce;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.Mushroom;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.Onion;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.RedPepper;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.ReggianoCheese;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.SlicedPepperoni;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.ThinCrustDough;

/*
 * 1) Build a factory for each region. 
 * To do this, you’ll create a subclass of PizzaIngredientFactory 
 * that implements each create method.
 * */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
