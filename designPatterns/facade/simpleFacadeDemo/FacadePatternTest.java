package designPatterns.facade.simpleFacadeDemo;

public class FacadePatternTest {

	public static void main(String[] args) {
		ComputerFacade computer = new ComputerFacade();
		computer.start();
	}

}
