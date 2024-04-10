package designPatterns.command.remoteControl.commands;

// this class implement a command that does nothing
// it's the default case if we don't set a command to a button of a slot
public class noCommand implements Command {

	@Override
	public void execute() {
		// blank

	}

	@Override
	public void undo() {
		// blank
	}

}
