package designPatterns.command.remoteControl.commands.garage;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor gargeDoor) {
		this.garageDoor = gargeDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.open();
	}

	@Override
	public void undo() {
		garageDoor.close();
	}

}
