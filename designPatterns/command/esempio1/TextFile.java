package designPatterns.command.esempio1;

public class TextFile {

	private String filname;
	private int size;

	public TextFile(String filname, int size) {
		
		if(filname == null || filname.length() <= 0)
			throw new IllegalArgumentException("filname == null || filname.length() <= 0");
		
		if(size < 0)
			throw new IllegalArgumentException("size < 0");
		
		this.filname = filname;
		this.size = size;
	}

	
	// getter and setter
	public String getFilname() {
		return filname;
	}

	protected void setFilname(String filname) {
		this.filname = filname;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "TextFile [filname = " + filname + ", size = " + size + "]";
	}
	
	
}
