package edu.ap.factorypattern1;

public class ConvertibleFactory extends CarFactory{
	
	@Override
	public ConvertibleBody createBody() {
		return new ConvertibleBody();
	}

	@Override
	public ConvertibleInterior createInterior() {
		return new ConvertibleInterior();
	}
}
