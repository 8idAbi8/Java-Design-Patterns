package designPatterns.command.remoteControl.commands.tv;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.TV;

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
