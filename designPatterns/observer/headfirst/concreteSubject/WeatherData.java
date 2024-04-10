package designPatterns.observer.headfirst.concreteSubject;

import java.util.ArrayList;

import designPatterns.observer.headfirst.interfaces.Observer;
import designPatterns.observer.headfirst.interfaces.Subject;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float tempereature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int idx = observers.indexOf(observer);
		
		if (idx >= 0)
			observers.remove(idx);
		// elimina l'observer di di indice idx
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);  // get() Returns the element at the specified position in this list
			observer.update(tempereature, humidity, pressure);
		}
	}

	// notify the observers when we get updated measurements 
	public void measurementsChange() {
		notifyObservers();
	}
	

	public void setMesurements(float temperature, float humidity, float pressure) {
		this.tempereature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChange();
	}
	
	
	// getter

//	public void getTemperature() {
//
//	}
//
//	public void getHumidity() {
//
//		
//	}
//	
//	public void getPressure() {
//
//	}

}
