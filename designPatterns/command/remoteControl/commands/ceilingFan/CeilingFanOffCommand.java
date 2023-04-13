package designPatterns.command.remoteControl.commands.ceilingFan;

import designPatterns.command.remoteControl.commands.Command;
import designPatterns.command.remoteControl.recivers.CeilingFan;

public class CeilingFanOffCommand implements Command {

	private CeilingFan CeilingFan;
	private int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan CeilingFan) {
		this.CeilingFan = CeilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = CeilingFan.getSpeed();
		CeilingFan.off();		
	}

	@Override
	public void undo() {

		if (prevSpeed == CeilingFan.HIGH) {
			CeilingFan.high();
		}
		else if (prevSpeed == CeilingFan.MEDIUM) {
			CeilingFan.medium();
		}
		else if (prevSpeed == CeilingFan.LOW) {
			CeilingFan.low();
		}
		else if (prevSpeed == CeilingFan.OFF) {
			CeilingFan.off();
		}
	
	}

}
