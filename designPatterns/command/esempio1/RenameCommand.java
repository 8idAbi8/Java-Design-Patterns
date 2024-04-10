package designPatterns.command.esempio1;

public class RenameCommand implements Command {

	private TextFile target;
	private String newFileName;
	private String oldFileName = null;


	public RenameCommand(TextFile target, String newFileName) {

		if(target == null || newFileName.length() <= 0)
			throw new IllegalArgumentException("target == null || newFileName.length() <= 0");

		this.target = target;
		this.newFileName = newFileName;
	}

	@Override
	public void execute() {
		oldFileName = target.getFilname();
		target.setFilname(newFileName);		
	}

	@Override
	public void undo() {
		if (oldFileName == null)
			throw new IllegalStateException("oldFileName == null");

		target.setFilname(oldFileName);
	}
}
