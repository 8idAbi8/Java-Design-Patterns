package designPatterns.observer.sensorNetwork;

public class TestDriver {

	public static void main(String[] args) {
		
		Sensor sensor = new Sensor();	// subject
		DataDisplayer dr = new DataDisplayer("DataReader_1");	// observer
		
		sensor.registerObserver(dr);
		sensor.readData();
	}
}
