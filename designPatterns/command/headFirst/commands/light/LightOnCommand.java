package designPatterns.command.headFirst.commands.light;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.Light;

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
