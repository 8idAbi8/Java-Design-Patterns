package designPatterns.adapter.headFirst.animals.concreteClasses;

import designPatterns.adapter.headFirst.animals.interfaces.Duck;

public class MallardDuck implements Duck {

	public void quack() {
		System.out.println("Quack");
	}
	
	public void fly() {
		System.out.println("I’m flying");
	}
}
