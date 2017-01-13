package edu.ap.factorypattern1;

public class Engine {
	
	enum GAS {
		DIESEL, PETROL
	}
	
	public Engine (int horsepower, int valves, GAS gas ){
		
		System.out.println("Deze auto heeft " + horsepower + "HP en heeft " + valves + "valves. Hij runt op " + gas);
		
	}

}
