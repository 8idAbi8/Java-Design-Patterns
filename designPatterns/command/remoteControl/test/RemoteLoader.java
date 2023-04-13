package designPatterns.command.remoteControl.test;

import designPatterns.command.remoteControl.commands.ceilingFan.CeilingFanOffCommand;
import designPatterns.command.remoteControl.commands.ceilingFan.CeilingFanOnCommand;
import designPatterns.command.remoteControl.commands.garage.GarageDoorCloseCommand;
import designPatterns.command.remoteControl.commands.garage.GarageDoorOpenCommand;
import designPatterns.command.remoteControl.commands.light.LightOffCommand;
import designPatterns.command.remoteControl.commands.light.LightOnCommand;
import designPatterns.command.remoteControl.commands.stereo.StereoOffCommand;
import designPatterns.command.remoteControl.commands.stereo.StereoOnWithCDCommands;
import designPatterns.command.remoteControl.invoker.RemoteControl;
import designPatterns.command.remoteControl.invoker.SimpleRemoteControl;
import designPatterns.command.remoteControl.recivers.GarageDoor;
import designPatterns.command.remoteControl.recivers.KitchenRoomLight;
import designPatterns.command.remoteControl.recivers.Light;
import designPatterns.command.remoteControl.recivers.CeilingFan;
import designPatterns.command.remoteControl.recivers.LivingRoomLight;
import designPatterns.command.remoteControl.recivers.Stereo;

public class RemoteLoader {

	public static void main(String[] args) {
		
		// Invoker
		RemoteControl remoteControl = new RemoteControl();
		
		
		// recivers	 // devices
		Light livingRoomLight = new LivingRoomLight();							 // Reciver of the request
		Light kitchenRoomLight = new KitchenRoomLight();
		CeilingFan livingRoomCeilingFan = new CeilingFan();
		GarageDoor garageDoor = new GarageDoor();  
		Stereo stereo = new Stereo();
		
		// Light command objects
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);  // create a command and pass the Reciver to it
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);		
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
		
		
		// creating on/off commands for the ceiling fan
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
		
		// creating open and close command for Garage
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		
		// creating on/off commands for Stereo
		StereoOnWithCDCommands stereoOnWithCDCommands = new StereoOnWithCDCommands(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		
		// loading the (above) commands into the remote slots
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		remoteControl.setCommand(3, stereoOnWithCDCommands, stereoOffCommand);
		remoteControl.setCommand(4, garageDoorOpenCommand, garageDoorCloseCommand);
		
		// toString()
		System.out.println(remoteControl);

		// "push" the remoteControl button on/off of each slot
		// "commands in action"
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		
		// undo
		remoteControl.undoButtonWasPushed();
		
	}

}
