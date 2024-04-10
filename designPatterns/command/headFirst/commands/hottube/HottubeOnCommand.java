package designPatterns.command.headFirst.commands.hottube;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.Hottube;

public class HottubeOnCommand implements Command {

	private Hottube hottube;
	
	public HottubeOnCommand(Hottube hottube) {
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
