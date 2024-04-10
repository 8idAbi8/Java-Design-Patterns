package designPatterns.command.headFirst.invoker;

import designPatterns.command.headFirst.commands.Command;

// Invoker

public class SimpleRemoteControl {   
	
	private Command slot;					
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {	// setCommand()  // takeOrder()
		slot.execute();  				// command.execute()
	}
}
