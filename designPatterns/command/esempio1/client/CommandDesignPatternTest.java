package designPatterns.command.esempio1.client;

import designPatterns.command.esempio1.RenameCommand;
import designPatterns.command.esempio1.TextFile;

public class CommandDesignPatternTest {

	public static void main(String[] args) {
		
   /* Il tipo di dati "var" è stato introdotto in Java a partire dalla versione 10. 
	* È un tipo di dato implicito, il cui valore viene determinato dal compilatore 
	* in base al contesto in cui viene utilizzato.*/
		
		// filname, dim;
		var f = new TextFile("file1.txt", 1234);
		
//		f.setFilname(null);	  // non accessibile
		
//		new RenameCommand(null, "file2.txt"); // provo a passare un target null
//		new RenameCommand(f, "");  // provo con stringa di lunghezza 0
		 
		var cmd = new RenameCommand(f, "file2.txt");
		
		System.out.println(f.getFilname() + ", " + f.getSize());
		
		cmd.execute();
		
		System.out.println(f);  // f.toSring
		
		cmd.undo();		
		System.out.println(f);
	}
}
