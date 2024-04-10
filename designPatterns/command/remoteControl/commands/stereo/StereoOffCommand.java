package designPatterns.command.remoteControl.commands.stereo;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.Stereo;

public class StereoOffCommand implements Command {

	//reciver
	Stereo stereo = new Stereo();
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}
