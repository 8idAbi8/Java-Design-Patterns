package designPatterns.command.remoteControl.commands.garage;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.GarageDoor;

public class GarageDoorCloseCommand implements Command {
	
	private GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor gargeDoor) {
		this.garageDoor = gargeDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.close();
	}

	@Override
	public void undo() {
		garageDoor.open();		
	}

}
