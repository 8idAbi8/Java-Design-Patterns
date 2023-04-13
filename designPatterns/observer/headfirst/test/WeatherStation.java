package designPatterns.observer.headfirst.test;

import designPatterns.observer.headfirst.concreteObservers.CurrentConditionsDisplay;
import designPatterns.observer.headfirst.concreteObservers.ForecastDisplay;
import designPatterns.observer.headfirst.concreteObservers.StatisticsDisplay;
import designPatterns.observer.headfirst.concreteSubject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
	
		WeatherData weatherData = new WeatherData();	// subject
	
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
	
		weatherData.setMesurements(80, 65, 30.4f);
		weatherData.setMesurements(82, 70, 29.2f);
		weatherData.setMesurements(78, 90, 29.2f);
		
//		currentConditionsDisplay.display();
	}

}
