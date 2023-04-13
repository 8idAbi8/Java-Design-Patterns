package designPatterns.observer.sensorNetwork;

public class DataDisplayer implements Observer {

	private String name;

	public DataDisplayer(String readerName) {
		name = readerName;
	}

	@Override
	public void update(float data) {
		System.out.println("Recived data: " + data + " from sensor: " + name );
	}

	

}
