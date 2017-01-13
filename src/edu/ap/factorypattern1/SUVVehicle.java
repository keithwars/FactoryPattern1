package edu.ap.factorypattern1;

public class SUVVehicle extends Vehicle{
	
private CarFactory factory;
	
	public SUVVehicle(CarFactory factory) {
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
