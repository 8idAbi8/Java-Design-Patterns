package designPatterns.command.remoteControl.commands.stereo;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.Stereo;

public class StereoOnCommand implements Command {

	//reciver
	Stereo stereo = new Stereo();

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();
	}


}
