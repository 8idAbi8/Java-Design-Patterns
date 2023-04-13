package designPatterns.command.stack.invoker;

import java.util.ArrayList;
import java.util.List;

import designPatterns.command.stack.commands.Command;


// questa classe è l'equivalente di StockBroker

public class StackCommandInvoker {
	
	/**/
	
	private List<Command> commandHistory = new ArrayList<>();

	public void executeCommand(Command command) {	// onButtonWasPushed
		command.execute();
		commandHistory.add(command);	// push
	}

	public void undoLastCommand() {			// undoButtonWasPushed
		if (!commandHistory.isEmpty()) {
			Command lastCommand = commandHistory.remove(commandHistory.size() - 1);	// pop
			lastCommand.undo();
		}
	}
	
	
}
