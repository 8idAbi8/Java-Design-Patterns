package designPatterns.command.remoteControl.invoker;

import designPatterns.command.remoteControl.commands.Command;

// Invoker (cameriere)

public class SimpleRemoteControl {   
	
	/* Uno slot (es. di una specifica lampadina) puo prendere in input i comandi: 
	 * LightOnCommand() e LightOffCommand(). (sono due bottoni dello slot)
	 * 
	 * Quando premiamo il bottone LightOnCommand(), l'invoker chiama il metodo execute() di
	 * quella specifica lampadina, il quale chiama il metodo on() sulla lampadina.
	 * */
	
	private Command slot;					
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {	// setCommand()  // takeOrder()
		slot.execute();  				// command.execute()
	}
	
	
}
