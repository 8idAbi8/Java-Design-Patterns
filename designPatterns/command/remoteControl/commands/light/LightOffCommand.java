package designPatterns.command.remoteControl.commands.light;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.Light;

// order-slip 

public class LightOffCommand implements Command {

	private Light light;		// reciver

	public LightOffCommand(Light light) {   // pass of the reciver
		this.light = light;
	}

	@Override
	public void execute() {		// orderUp()
		light.off();				// reciver.action()
	}

	@Override
	public void undo() {
		light.on();
	}

}
