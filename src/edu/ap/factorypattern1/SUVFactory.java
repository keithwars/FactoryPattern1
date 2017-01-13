package edu.ap.factorypattern1;

public class SUVFactory extends CarFactory{

	@Override
	public SUVBody createBody() {
		return new SUVBody();
	}

	@Override
	public SUVInterior createInterior() {
		return new SUVInterior();
	}
	
}
