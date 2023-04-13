package designPatterns.observer.headfirst.concreteObservers;

import designPatterns.observer.headfirst.concreteSubject.WeatherData;
import designPatterns.observer.headfirst.interfaces.DisplayElement;
import designPatterns.observer.headfirst.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	public StatisticsDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}

}
