package edu.ap.factorypattern1;

import edu.ap.factorypattern1.Engine.GAS;

public abstract class CarFactory {

	public Engine makeEngine() {
		return new Engine(1600, 6, GAS.DIESEL);
	}
	
	public abstract Body createBody();
	
	public abstract Interior createInterior();
	
}
