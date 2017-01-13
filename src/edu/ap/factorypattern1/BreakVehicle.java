package edu.ap.factorypattern1;


public class BreakVehicle extends Vehicle{

private CarFactory factory;
	
	public BreakVehicle(CarFactory factory) {
		this.factory = factory;
	}

	@Override
	public void createVehicle() {
		this.setEngine(factory.makeEngine());
		this.setBody(factory.createBody());
		this.setInterior(factory.createInterior());
		System.out.println("Break created");
	}
	
}
