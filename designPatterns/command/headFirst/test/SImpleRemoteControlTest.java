package designPatterns.command.headFirst.test;

import designPatterns.command.headFirst.commands.garage.GarageDoorOpenCommand;
import designPatterns.command.headFirst.commands.light.LightOnCommand;
import designPatterns.command.headFirst.invoker.SimpleRemoteControl;
import designPatterns.command.headFirst.recivers.GarageDoor;
import designPatterns.command.headFirst.recivers.LivingRoomLight;

public class SImpleRemoteControlTest {

	public static void main(String[] args) {
		
		// Invoker
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		
		
		// Light
		LivingRoomLight light = new LivingRoomLight();							 // Reciver of the request
		LightOnCommand lightOn = new LightOnCommand(light);  // create a command and pass the Reciver to it
				
		
		// GarageDoor
		GarageDoor garageDoor = new GarageDoor();  
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		remoteControl.setCommand(garageDoorOpenCommand);
		remoteControl.buttonWasPressed();
		
		remoteControl.setCommand(lightOn);  // pass the command
		remoteControl.buttonWasPressed();   // make the request to the Reciver
		
	}

}
