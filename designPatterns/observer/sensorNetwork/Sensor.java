package designPatterns.observer.sensorNetwork;

import java.util.ArrayList;
import java.util.Random;


public class Sensor implements Subject {

	private ArrayList<Observer> observers;
	private float random;
	
	public Sensor() {
		observers = new ArrayList<>();
	}
	
	public void readData() {  // sensore
		// lettura dati
		random = new Random().nextFloat() * 100;
		
		notifyObservers(random);
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		int idx = observers.indexOf(observer);
		
		if (idx >= 0) {
			observers.remove(idx);
		}
		
	}

	@Override
	public void notifyObservers(float data) {
		for (Observer observer : observers) {
			observer.update(data);
		}
	}


}
