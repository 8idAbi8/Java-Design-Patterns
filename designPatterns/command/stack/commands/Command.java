package designPatterns.command.stack.commands;

public interface Command {

	public void execute();
	
	public void undo();
}
