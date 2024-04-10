package designPatterns.command.headFirst.commands.ceilingFan;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.CeilingFan;

public class CeilingFanOnCommand implements Command {

	private CeilingFan CeilingFan;
	
	public CeilingFanOnCommand(CeilingFan CeilingFan) {
		this.CeilingFan = CeilingFan;
	}

	@Override
	public void execute() {
		CeilingFan.on();		
	}

	@Override
	public void undo() {
		CeilingFan.off();
	}	

}
