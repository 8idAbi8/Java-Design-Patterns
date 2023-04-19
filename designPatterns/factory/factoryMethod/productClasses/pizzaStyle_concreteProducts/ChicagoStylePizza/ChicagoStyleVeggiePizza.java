package designPatterns.factory.factoryMethod.productClasses.pizzaStyle_concreteProducts.ChicagoStylePizza;

import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare ChicagoStyleVeggiePizza");
	}

	@Override
	public void bake() {
		System.out.println("bake ChicagoStyleVeggiePizza");		
	}

	@Override
	public void cut() {
		System.out.println("cut ChicagoStyleVeggiePizza");	
	}

	@Override
	public void box() {
		System.out.println("box ChicagoStyleVeggiePizza \n");
	}

}
