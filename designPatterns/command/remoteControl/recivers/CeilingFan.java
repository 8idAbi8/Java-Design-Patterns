package designPatterns.command.remoteControl.recivers;

// Reciver 

public class CeilingFan {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private String location;
	private int speed;		// local state of CeilingFan class

	public CeilingFan() {
		this.location = "Living Room";  // default location
		speed = OFF;
	}
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println(location + " speed = HIGH");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " speed = MEDIUM");
	}
	
	public void low() {
		speed = LOW;
		System.out.println(location + " speed = LOW");
	}
	
	public void off() {
		speed = OFF;
		System.out.println(location + " speed = OFF");
	}
	
	
	public void on() {
		System.out.println(location + " Ceiling Fan is On");
	}
	
	public int getSpeed() {
		return speed;
	}

}
