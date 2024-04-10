package designPatterns.command.headFirst.recivers;

// Reciver 

public class TV {
	
	private String location;
		
	public TV(String location) {
		this.location = location;
	}
	
	public void off() {
		System.out.println(location + " TV is Off");
	}
	
	
	public void on() {
		System.out.println(location + " TV is On");
	}
	
}
