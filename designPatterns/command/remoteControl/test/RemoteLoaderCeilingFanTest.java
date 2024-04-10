package designPatterns.command.remoteControl.test;

import designPatterns.command.remoteControl.commands.ceilingFan.CeilingFanHighCommand;
import designPatterns.command.remoteControl.commands.ceilingFan.CeilingFanMediumCommand;
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

public class RemoteLoaderCeilingFanTest {

	public static void main(String[] args) {
		
		// Invoker
		RemoteControl remoteControl = new RemoteControl();
		
		
		// recivers	 // devices
		CeilingFan ceilingFan = new CeilingFan("Bath Room");
		
		// creating high/medium/low/off commands for the ceiling fan
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		
		// loading medium in slot 0 and high in slot 1
		remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		
		
		// "commands in action"
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);		// toString
		remoteControl.undoButtonWasPushed();	// undo
		
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);		// toString
		remoteControl.undoButtonWasPushed();	// undo
		
	}

}
