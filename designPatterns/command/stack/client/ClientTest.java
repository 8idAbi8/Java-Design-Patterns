package designPatterns.command.stack.client;

import designPatterns.command.stack.commands.Command;
import designPatterns.command.stack.commands.PopCommand;
import designPatterns.command.stack.commands.PushCommand;
import designPatterns.command.stack.exception.EmptyStackException;
import designPatterns.command.stack.invoker.StackCommandInvoker;
import designPatterns.command.stack.reciver.SimpleStack;
import designPatterns.command.stack.reciver.Stack;

public class ClientTest {
	
	public static void main(String[] args) {

		// invoker
		StackCommandInvoker invoker = new StackCommandInvoker();

		// reciver
		Stack stack = new SimpleStack();
		
//		stack.push("Hello");
//		stack.push("World");

		// comando PushCommand per inserire un valore nello stack
		Command pushCommand = new PushCommand(stack, "Java");

		// Esegui il comando
		invoker.executeCommand(pushCommand);   //pushCommand.execute();

		// Stampa lo stack
		System.out.println(stack);

		// Crea un nuovo comando PopCommand per rimuovere l'ultimo valore dallo stack
		Command popCommand = new PopCommand(stack);

		// Esegui il comando
		try {
			invoker.executeCommand(popCommand); // popCommand.execute();
		} catch (EmptyStackException e) {
			System.out.println("Lo stack è vuoto");
		}

		// Stampa lo stack
		System.out.println(stack);

		// Annulla l'ultimo comando eseguito, cioè l'operazione di pop
		invoker.undoLastCommand(); //popCommand.undo();

		// Stampa lo stack
		System.out.println(stack);
	}
}

