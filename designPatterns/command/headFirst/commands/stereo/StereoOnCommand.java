package designPatterns.command.headFirst.commands.stereo;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.Stereo;

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
