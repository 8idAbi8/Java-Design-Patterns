package designPatterns.command.remoteControl.commands.light;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.Light;

// order-slip 

public class LightOnCommand implements Command {

	private Light light;		// reciver
	
	public LightOnCommand(Light light) {   // pass of the reciver
		this.light = light;
	}

	@Override
	public void execute() {		// orderUp()
		light.on();				// reciver.action()
	}

	@Override
	public void undo() {
		light.off();
	}

}
