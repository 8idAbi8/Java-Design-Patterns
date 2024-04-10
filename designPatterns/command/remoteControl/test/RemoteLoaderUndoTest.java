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
import designPatterns.command.remoteControl.recivers.GarageDoor;
import designPatterns.command.remoteControl.recivers.KitchenRoomLight;
import designPatterns.command.remoteControl.recivers.Light;
import designPatterns.command.remoteControl.recivers.CeilingFan;
import designPatterns.command.remoteControl.recivers.LivingRoomLight;
import designPatterns.command.remoteControl.recivers.Stereo;

public class RemoteLoaderUndoTest {

	public static void main(String[] args) {

		// Invoker
		RemoteControl remoteControlWithUndo = new RemoteControl();

		// Receivers	 // devices
		Stereo stereo = new Stereo();

		// creating on/off commands for Stereo
		StereoOnWithCDCommands stereoOnWithCDCommands = new StereoOnWithCDCommands(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

		// loading the (above) commands into the remote slots
		remoteControlWithUndo.setCommand(0, stereoOnWithCDCommands, stereoOffCommand);

		// "push" the remoteControl button on/off of each slot
		// "commands in action"
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);

		// toString()
		System.out.println(remoteControlWithUndo);

		// undo
		remoteControlWithUndo.undoButtonWasPushed();

		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.onButtonWasPushed(0);
		
		// toString()
		System.out.println(remoteControlWithUndo);
		
		// undo
		remoteControlWithUndo.undoButtonWasPushed();
		
	}

}
