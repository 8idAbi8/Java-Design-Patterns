package designPatterns.command.remoteControl.commands.hottube;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.Hottube;

public class HottubeOffCommand implements Command {

	private Hottube hottube;
	
	public HottubeOffCommand(Hottube hottube) {
		this.hottube = hottube;
	}

	@Override
	public void execute() {
		hottube.on();
	}

	@Override
	public void undo() {
		hottube.off();
	}

}
