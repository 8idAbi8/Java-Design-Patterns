package designPatterns.command.headFirst.commands.light;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.Light;

// order-slip 

public class LightOffCommand implements Command {

	private Light light;					// reciver

	public LightOffCommand(Light light) {   // pass of the reciver
		this.light = light;
	}

	@Override
	public void execute() {					// orderUp()
		light.off();						// reciver.action()
	}

	@Override
	public void undo() {
		light.on();
	}

}
