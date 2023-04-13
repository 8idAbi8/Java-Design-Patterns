package designPatterns.facade.headfirstHomeTheater;

import designPatterns.facade.headfirstHomeTheater.subsystems.Amplifier;
import designPatterns.facade.headfirstHomeTheater.subsystems.CdPlayer;
import designPatterns.facade.headfirstHomeTheater.subsystems.DvdPlayer;
import designPatterns.facade.headfirstHomeTheater.subsystems.PopcornPopper;
import designPatterns.facade.headfirstHomeTheater.subsystems.Projector;
import designPatterns.facade.headfirstHomeTheater.subsystems.Screen;
import designPatterns.facade.headfirstHomeTheater.subsystems.TheaterLights;
import designPatterns.facade.headfirstHomeTheater.subsystems.Tuner;

public class HomeTheatreTestDrive {

	public static void main(String[] args) {

		// instantiation of components of the subsystems here
		/* Normally the client is given a facade, 
		   it doesn’t have to construct one itself. */
		
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
				
		
		HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
		
		homeTheatreFacade.watchMovie("Matrix Resurrections");
		homeTheatreFacade.endMovie();
		

	}

}
