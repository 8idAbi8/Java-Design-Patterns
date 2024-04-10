package designPatterns.command.headFirst.commands.garage;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.GarageDoor;

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
