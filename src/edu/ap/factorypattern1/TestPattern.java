package edu.ap.factorypattern1;


public class TestPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BreakFactory bf = new BreakFactory();
		ConvertibleFactory cf = new ConvertibleFactory();
		SUVFactory sf = new SUVFactory();
		
		BreakVehicle breakVehicle = new BreakVehicle(bf);
		ConvertibleVehicle convertibleVehicle = new ConvertibleVehicle(cf);
		SUVVehicle suvVehicle = new SUVVehicle(sf);
		
		breakVehicle.createVehicle();
		System.out.println("************************");
		convertibleVehicle.createVehicle();
		System.out.println("************************");
		suvVehicle.createVehicle();
}
}

