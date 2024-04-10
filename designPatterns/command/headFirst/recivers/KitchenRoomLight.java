package designPatterns.command.headFirst.recivers;

// Reciver 

public class KitchenRoomLight implements Light {

	// the action(s) of the reciver
	
	public void on() {
		System.out.println("KitchenRoomLight is On");
	}
	
	public void off() {
		System.out.println("KitchenRoomLight is Off");
	}

}
