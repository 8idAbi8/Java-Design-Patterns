package designPatterns.command.stack.commands;

import designPatterns.command.stack.reciver.Stack;

public class PopCommand implements Command {

	private Stack stack;
	public Object value;
	
	public PopCommand(Stack stack) {
		this.stack = stack;
		this.value = stack.pop(); // stack.size() - 1;
	}
	
	public void execute() {
		// Do nothing, since pop has already been executed
	}
	
	public void undo() {
		stack.push(value);
	}
}
