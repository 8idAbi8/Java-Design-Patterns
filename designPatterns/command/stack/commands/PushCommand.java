package designPatterns.command.stack.commands;

import java.util.List;

import designPatterns.command.stack.reciver.Stack;

public class PushCommand implements Command {
	
	private Stack stack;
	private Object value;
	
	// viene passato il Reciver
	public PushCommand(Stack stack, Object value) {
		this.stack = stack;
		this.value = value;
	}
	
	public void execute() {
		stack.push(value);
	}
	
	public void undo() {
		stack.pop();
	}
}
