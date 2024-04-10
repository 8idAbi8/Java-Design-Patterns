package designPatterns.command.headFirst.commands.tv;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.TV;

public class TvOffCommand implements Command {
	
	private TV tv;
	
	public TvOffCommand(TV tv) {
		this.tv = tv;
	}	
	
	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}

}
