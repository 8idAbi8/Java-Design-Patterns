package designPatterns.command.remoteControl.commands.tv;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.TV;

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
