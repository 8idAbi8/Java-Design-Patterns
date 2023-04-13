package designPatterns.facade.headfirstHomeTheater;

import designPatterns.facade.headfirstHomeTheater.subsystems.Amplifier;
import designPatterns.facade.headfirstHomeTheater.subsystems.CdPlayer;
import designPatterns.facade.headfirstHomeTheater.subsystems.DvdPlayer;
import designPatterns.facade.headfirstHomeTheater.subsystems.PopcornPopper;
import designPatterns.facade.headfirstHomeTheater.subsystems.Projector;
import designPatterns.facade.headfirstHomeTheater.subsystems.Screen;
import designPatterns.facade.headfirstHomeTheater.subsystems.TheaterLights;
import designPatterns.facade.headfirstHomeTheater.subsystems.Tuner;

public class HomeTheatreFacade {

	// Components of the subsystems
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;

	public HomeTheatreFacade(Amplifier amp, 
			Tuner tuner, 
			DvdPlayer dvd, 
			CdPlayer cd, 
			Projector projector,
			TheaterLights lights, 
			Screen screen, 
			PopcornPopper popper) {

		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}


	public void watchMovie(String movie) {

		System.out.println("Get ready to watch a movie..");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);	
	}

	public void endMovie() {
		
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

}
