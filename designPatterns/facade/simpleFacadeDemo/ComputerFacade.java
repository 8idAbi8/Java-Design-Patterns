package designPatterns.facade.simpleFacadeDemo;

import designPatterns.facade.simpleFacadeDemo.subsystems.Cpu;
import designPatterns.facade.simpleFacadeDemo.subsystems.Disk;
import designPatterns.facade.simpleFacadeDemo.subsystems.Ram;

// facade

public class ComputerFacade {

	private Cpu cpu;
	private Ram ram;
	private Disk disk;
	
	public ComputerFacade() {
		ram = new Ram(1024);
		cpu = new Cpu();
		disk = new Disk();
	}
	
	// Facade::doSomething()
	public void start() {
		cpu.stop();
		ram.load(disk.getBootSector());
		cpu.start();
	}

}
