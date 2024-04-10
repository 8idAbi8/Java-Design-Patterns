package designPatterns.command.headFirst.commands.tv;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.TV;

public class TvOnCommand implements Command {
	
	private TV tv;
	
	public TvOnCommand(TV tv) {
		this.tv = tv;
	}	
	
	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}
}
