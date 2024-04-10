package designPatterns.command.remoteControl.invoker;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.commands.noCommand;

// Invoker (cameriere)

public class RemoteControl {   
	
	/* 
	 * */
	
	private Command[] onCommands;
	private Command[] offCommands;
	
	private Command undoCommand; // the last command we executed
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new noCommand();
		
		for (int i = 0; i < offCommands.length; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {	// setCommand()  // takeOrder()
		onCommands[slot].execute(); 				// command.execute()
		
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {	// setCommand()  // takeOrder()
		offCommands[slot].execute(); 				// command.execute()
		
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	
	
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------------------------------------------------- "
				+ "Remote Control -------------------------------------------------------\n\n");
		
		for (int i = 0; i < offCommands.length; i++) {
			stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() 
					+  "\t\t" + offCommands[i].getClass().getName() + "\n");
		}
		
		stringBuffer.append("[undo]   " + undoCommand.getClass().getName()+ "\n");
		
		return stringBuffer.toString();
	}

	/*
	@Override
	public String toString() {
		return "RemoteControl [onCommands=" + Arrays.toString(onCommands) + ", offCommands="
				+ Arrays.toString(offCommands) + "]";
	}
	*/
	
}
