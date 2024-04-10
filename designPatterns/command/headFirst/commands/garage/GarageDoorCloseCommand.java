package designPatterns.command.headFirst.commands.garage;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.GarageDoor;

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
