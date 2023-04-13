package designPatterns.adapter.animals.adapters;

import designPatterns.adapter.animals.interfaces.Duck;
import designPatterns.adapter.animals.interfaces.Turkey;

/*
 * The Adapter implements the target interface and holds an instance of the Adaptee.
 * TurkeyAdapter implemented the target interface, Duck.
 * Turkey is the adaptee interface.
 * 
 * L'obiettivo di questa classe è quello di adattare un oggetto Turkey affinché possa essere 
 * utilizzato come Duck, poiché entrambi hanno metodi simili ma con nomi(interfaccie) diversi.
 * 
 * How the Client uses the Adapter:
 * The client makes a request to the adapter by calling a method on it using the target interface.
 * The adapter translates the request into one or more calls on the adaptee using the adaptee interface.
 * The client receives the results of the call and never knows there is an adapter doing the translation.
 * 
 */

public class TurkeyAdapter implements Duck {
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
