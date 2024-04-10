package designPatterns.command.stack.reciver;

import java.util.ArrayDeque;
import java.util.Deque;

import designPatterns.command.stack.exception.EmptyStackException;

public class SimpleStack implements Stack {

//	private List<Object> stack;
	private Deque<Object> stack;
	
	// private Command undoCommand;

	private Object mutex;

	public SimpleStack() {
		stack = new ArrayDeque<>(); 	// new ArrayList<>();
//		undoCommand = new noCommand();
		mutex = new Object();
	}

	public void push(Object value) {
		
		synchronized (mutex) {
			
			stack.push(value);  // stack.add(value);

//			undoCommand = new PushCommand(stack, value);

			// se è il primo elemento, sveglio un consumatore
			if (stack.size() == 1) {
				stack.notify();
			}
		}
	}

	
	public Object pop() throws EmptyStackException {
		synchronized (mutex) {
			// se non ce nessun elemento, il consumatore va in wait
			if (stack.isEmpty()) {  // (stack.size() == 0)
				try {
					stack.wait();
				} catch (InterruptedException | EmptyStackException e) {
					e.printStackTrace();
				}
			}

			// toglie e ritorna l'ultimo elemento dell'array, 
			// ovvero l'elemento sulla testa della pila
			Object result = stack.remove(stack.size() - 1);

			// se c'e almeno 1 elemento... allorra.. 
			// il consumatore corrente dopo aver consumato un elemento,
			// sveglia un altro consumatore
			if (stack.size() > 0) 
				stack.notify();

			return result;
		}
	}

	@Override
	public int size() {
		return stack.size();
	}
	
}
