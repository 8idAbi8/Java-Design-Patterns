package designPatterns.command.remoteControl.test;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.commands.MacroCommand;
import designPatterns.command.remoteControl.commands.hottube.HottubeOffCommand;
import designPatterns.command.remoteControl.commands.hottube.HottubeOnCommand;
import designPatterns.command.remoteControl.commands.light.LightOffCommand;
import designPatterns.command.remoteControl.commands.light.LightOnCommand;
import designPatterns.command.remoteControl.commands.stereo.StereoOffCommand;
import designPatterns.command.remoteControl.commands.stereo.StereoOnCommand;
import designPatterns.command.remoteControl.commands.tv.TvOffCommand;
import designPatterns.command.remoteControl.commands.tv.TvOnCommand;
import designPatterns.command.remoteControl.invoker.RemoteControl;
import designPatterns.command.remoteControl.recivers.Hottube;
import designPatterns.command.remoteControl.recivers.Light;
import designPatterns.command.remoteControl.recivers.LivingRoomLight;
import designPatterns.command.remoteControl.recivers.Stereo;
import designPatterns.command.remoteControl.recivers.TV;

public class MacroCommandTest {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		
		// recivers
		Light livingRoomlight = new LivingRoomLight();
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottube hottube = new Hottube();
		
		// command on objects
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomlight);
		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		TvOnCommand tvOnCommand = new TvOnCommand(tv);
		HottubeOnCommand hottubeOnCommand = new HottubeOnCommand(hottube);
		
		// command off objects
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomlight);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		TvOffCommand tvOffCommand = new TvOffCommand(tv);
		HottubeOffCommand hottubeOffCommand = new HottubeOffCommand(hottube);
		
		
		// MacroComands
		Command[] partyOn = { lightOnCommand, stereoOnCommand, tvOnCommand, hottubeOnCommand};
		Command[] partyOff = { lightOffCommand, stereoOffCommand, tvOffCommand, hottubeOffCommand};
	
		// create 2 macros to hold the above arrays
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
	
		// remote control
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
	
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("\n--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(0);
	}
	
	
}
