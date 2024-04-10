package designPatterns.observer.headfirst.concreteObservers;

import designPatterns.observer.headfirst.interfaces.DisplayElement;
import designPatterns.observer.headfirst.interfaces.Observer;
import designPatterns.observer.headfirst.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	// Subject
	private Subject weatherData;
	
	private float tempereature;
	private float humidity;
	
	
	public CurrentConditionsDisplay(Subject weatherDate) {
		this.weatherData = weatherDate;
		
		weatherDate.registerObserver(this);
	}
	
	/* Il metodo update() dell'interfaccia Observer ha lo scopo di fornire 
	 * un meccanismo per gli osservatori per ricevere gli aggiornamenti da un 
	 * oggetto osservabile e consentire agli osservatori di eseguire le azioni 
	 * appropriate in risposta a tali aggiornamenti. 
	 * 
	 * Quando l'oggetto osservabile cambia il suo stato interno o avviene un 
	 * evento rilevante, notificherà gli osservatori chiamando il metodo update() 
	 * su ciascun osservatore registrato.
	 * */
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
