package designPatterns.facade.headfirstHomeTheater.subsystems;

public class DvdPlayer {

	public void on() {
		System.out.println("DvdPlayer on");
	}

	public void play(String movie) {
		System.out.println("DVD Player playing: " + movie);
	}

	public void stop() {
		System.out.println("DvdPlayer stop");
	}

	public void eject() {
		System.out.println("DVD Player eject");
	}

	public void off() {
		System.out.println("DvdPlayer off");
	}

}
