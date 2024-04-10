package designPatterns.command.remoteControl.test;

import designPatterns.command.remoteControl.commands.garage.GarageDoorOpenCommand;
import designPatterns.command.remoteControl.commands.light.LightOnCommand;
import designPatterns.command.remoteControl.invoker.SimpleRemoteControl;
import designPatterns.command.remoteControl.recivers.GarageDoor;
import designPatterns.command.remoteControl.recivers.LivingRoomLight;

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
