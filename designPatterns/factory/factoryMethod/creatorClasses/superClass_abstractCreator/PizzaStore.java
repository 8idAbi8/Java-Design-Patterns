package designPatterns.factory.factoryMethod.creatorClasses.superClass_abstractCreator;

import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public abstract class PizzaStore {
	
//	subclasses Cannot override the final method from PizzaStore
	public final Pizza orderPizza(String type) {
		
		Pizza pizza;
		
//		call to a method in the PizzaStore rather than on a factory object
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
//	abstract Product factoryMethod
//	A factory method is	abstract so the subclasses are counted on to handle	object creation.
//	A factory method returns a Product that is typically used within methods defined in the superclass.
/*	A factory method handles object creation and encapsulates it in	a subclass. 
 * This decouples the client code in the superclass from 
 * the object creation code in the subclass. */
	protected abstract Pizza createPizza(String type);
}
