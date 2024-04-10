package designPatterns.adapter.animals;

import designPatterns.adapter.animals.adapters.TurkeyAdapter;
import designPatterns.adapter.animals.concreteClasses.MallardDuck;
import designPatterns.adapter.animals.concreteClasses.WildTurkey;
import designPatterns.adapter.animals.interfaces.Duck;
import designPatterns.adapter.animals.interfaces.Turkey;

public class DuckTestDrive {
	
	public static void main(String[] args) {
		
		Duck duck = new MallardDuck();
		
		Turkey turkey = new WildTurkey();
		
		// prendiamo un Turkey e lo adattiamo affinché possa essere utilizzato come Duck
		Duck turkeyAdapter = new TurkeyAdapter(turkey);  // TurkeyAdapter implements Duck
		
		System.out.println("The Turkey says...");
		
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		
		// Turkey viene uttilizzato come Duck
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
