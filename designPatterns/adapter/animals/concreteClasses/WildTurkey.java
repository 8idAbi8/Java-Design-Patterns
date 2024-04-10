package designPatterns.adapter.animals.concreteClasses;

import designPatterns.adapter.animals.interfaces.Turkey;

public class WildTurkey implements Turkey {
	
	public void gobble() {
		System.out.println("Gobble gobble");
	}
	
	public void fly() {
		System.out.println("I’m flying a short distance");
	}
}
