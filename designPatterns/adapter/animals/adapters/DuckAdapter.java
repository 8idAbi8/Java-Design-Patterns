package designPatterns.adapter.animals.adapters;

import java.util.Random;

import designPatterns.adapter.animals.interfaces.Duck;
import designPatterns.adapter.animals.interfaces.Turkey;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
	
	public void gobble() {
		duck.quack();
	}
	
	public void fly() {
		if (rand.nextInt(5) == 0) {  // fly on average 1 of 5 times
			duck.fly();
		}
	}
}
