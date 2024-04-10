package designPatterns.command.headFirst.commands.ceilingFan;

import designPatterns.command.headFirst.commands.Command;
import designPatterns.command.headFirst.recivers.CeilingFan;

public class CeilingFanMediumCommand implements Command {

	private CeilingFan CeilingFan;
	private int prevSpeed;

	public CeilingFanMediumCommand(CeilingFan CeilingFan) {
		this.CeilingFan = CeilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = CeilingFan.getSpeed();
		CeilingFan.medium();		
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
