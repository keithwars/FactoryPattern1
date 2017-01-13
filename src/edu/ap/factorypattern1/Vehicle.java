package edu.ap.factorypattern1;

public abstract class Vehicle {

	protected Engine engine;
	protected Body body;
	protected Interior interior;
	
	public abstract void createVehicle();
	
	public void setEngine(Engine engine){
		this.engine = engine;
	}
	
	public void setBody(Body body){
		this.body = body;
	}
	
	public void setInterior(Interior interior){
		this.interior = interior;
	}
}
