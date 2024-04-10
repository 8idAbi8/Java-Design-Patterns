package designPatterns.command.remoteControl.commands.ceilingFan;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.CeilingFan;

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
