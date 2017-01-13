package edu.ap.factorypattern1;

public class BreakFactory extends CarFactory {

	@Override
	public BreakBody createBody() {
		return new BreakBody();
	}

	@Override
	public BreakInterior createInterior() {
		return new BreakInterior();
	}
}
