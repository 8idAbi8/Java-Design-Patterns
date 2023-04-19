package designPatterns.factory.factoryMethod.test;

import designPatterns.factory.factoryMethod.creatorClasses.franchiseStoreSubclass_concreteCreators.ChicagoStylePizzaStore;
import designPatterns.factory.factoryMethod.creatorClasses.franchiseStoreSubclass_concreteCreators.NYStylePizzaStore;
import designPatterns.factory.factoryMethod.creatorClasses.superClass_abstractCreator.PizzaStore;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		PizzaStore NYPizzaStore = new NYStylePizzaStore();
		PizzaStore ChicagoPizzaStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = NYPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		Pizza pizza2 = ChicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza2.getName() + "\n");
	}

}
