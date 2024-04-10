package designPatterns.command.headFirst.commands.stereo;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.Stereo;

public class StereoOnWithCDCommands implements Command {

	//reciver
	Stereo stereo = new Stereo();
	
	public StereoOnWithCDCommands(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}

}
