package designPatterns.command.headFirst.recivers;

// Reciver 

public class LivingRoomLight implements Light {

	// the action(s) of the reciver
	
	public void on() {
		System.out.println("LivingRoomLight is On");
	}
	
	public void off() {
		System.out.println("LivingRoomLight is Off");
	}
}
