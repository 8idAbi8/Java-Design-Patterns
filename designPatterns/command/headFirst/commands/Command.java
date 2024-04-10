package designPatterns.command.headFirst.commands;

public interface Command {	
	 
	// orderUp(): il cameriere (l'invoker) prende il order-slip e lo mette nella bacheca degli ordini da eseguire
	// il cameriere è decoupled da chi effettivamente esegue l'ordine (il cuoco (il Reciver) )
	// l'invoker non ha knowledge su come eseguire l'ordine.
	// il reciver ha la knowledge su come eseguire l'ordine.
	
	
	public void execute();	// orderUp(); 
	
	public void undo();
}
