package designPatterns.command.headFirst.test;

import designPatterns.command.headFirst.commands.stereo.StereoOffCommand;
import designPatterns.command.headFirst.commands.stereo.StereoOnWithCDCommands;
import designPatterns.command.headFirst.invoker.RemoteControl;
import designPatterns.command.headFirst.recivers.Stereo;

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
