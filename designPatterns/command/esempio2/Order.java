package designPatterns.command.esempio2;

// interfaccia command
public interface Order {
	
	public abstract void execute();

	void undo();
}
