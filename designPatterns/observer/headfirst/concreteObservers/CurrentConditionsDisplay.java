package designPatterns.observer.headfirst.concreteObservers;

import designPatterns.observer.headfirst.interfaces.DisplayElement;
import designPatterns.observer.headfirst.interfaces.Observer;
import designPatterns.observer.headfirst.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float tempereature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherDate) {
		this.weatherData = weatherDate;
		weatherDate.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.tempereature = temperature;
		this.humidity = humidity;
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + tempereature + 
				"C degrees and " + humidity + "% humidity");
	}


}
