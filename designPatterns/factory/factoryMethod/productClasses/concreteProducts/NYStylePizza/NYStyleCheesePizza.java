package designPatterns.factory.factoryMethod.productClasses.concreteProducts.NYStylePizza;

import designPatterns.factory.factoryMethod.ingredientFamily.ingredients.ReggianoCheese;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza() {
		
		name = "NY Style Sauce and Cheese Pizza";
//		dough = "Thin Crust Dough";
//		sauce = "Marinara Sauce";
//		cheese = new ReggianoCheese();
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

}
