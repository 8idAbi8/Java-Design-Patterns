package designPatterns.factory.abstractFactory.concreteFactories;

import designPatterns.factory.abstractFactory.PizzaIngredientFactory;
import designPatterns.factory.factoryMethod.ingredientFamily.Cheese;
import designPatterns.factory.factoryMethod.ingredientFamily.Clams;
import designPatterns.factory.factoryMethod.ingredientFamily.Dough;
import designPatterns.factory.factoryMethod.ingredientFamily.Pepperoni;
import designPatterns.factory.factoryMethod.ingredientFamily.Sauce;
import designPatterns.factory.factoryMethod.ingredientFamily.Veggies;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.BlackOlives;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.EggPlant;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.FrozenClams;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.MozzarellaCheese;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.PlumTomatoSauce;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.RedPepper;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.SlicedPepperoni;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.Spinach;
import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Spinach(), new EggPlant(), new BlackOlives(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
