package designPatterns.command.stack.reciver;

import designPatterns.command.stack.exception.EmptyStackException;

public interface Stack {
	public void push(Object value);
	public Object pop() throws EmptyStackException;
	public int size();
}
