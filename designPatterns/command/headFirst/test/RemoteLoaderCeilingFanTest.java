package designPatterns.command.headFirst.test;

import designPatterns.command.headFirst.commands.ceilingFan.CeilingFanHighCommand;
import designPatterns.command.headFirst.commands.ceilingFan.CeilingFanMediumCommand;
import designPatterns.command.headFirst.commands.ceilingFan.CeilingFanOffCommand;
import designPatterns.command.headFirst.invoker.RemoteControl;
import designPatterns.command.headFirst.recivers.CeilingFan;

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
