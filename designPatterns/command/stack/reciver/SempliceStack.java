package designPatterns.command.stack.reciver;

import java.util.*;

public class SempliceStack implements Stack {

	private Deque<Object> stack;

	public SempliceStack() {
		stack = new ArrayDeque<Object>();
	}

	public void push(Object value) {
		stack.push(value);
		System.out.println("aggiunto: " + value);
	}

	public Object pop() throws EmptyStackException {
		if (stack.isEmpty()) {
			throw new EmptyStackException();
		}

		System.out.println("Size: " + stack.size());
		return stack.pop();
	}

	@Override
	public int size() {
		return stack.size();
	}
}


