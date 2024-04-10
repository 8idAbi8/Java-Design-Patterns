package designPatterns.command.headFirst.recivers;

public class Stereo {

	private String location;
	
	public Stereo() {
		location = "";
	}
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " Stereo is On");	
	}

	public void off() {
		System.out.println(location + " Stereo is Off");	
	}

	public void setCD() {
		System.out.println(location + " Stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " Stereo is set for DVD input");
	}

	public void radio() {
		System.out.println(location + " Stereo is set for Radio");
	}

	public void setVolume(int i) {
		System.out.println(location + " Stereo volume is set to 11");
	}
}
