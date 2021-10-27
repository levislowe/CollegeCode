package Toll;


import java.awt.*;

import Sweat.*;

public class Truck implements Booth {
	public int Money;
	public int People;
	public int Vehicle;
	
	public Truck(int Money, int People, int Vehicle ) {
		this.Money = Money; this.People = People;
		this.Vehicle = Vehicle;
		
	}
	
	public int getPeople() {
		return People;
	}

	public int getMoney() {
		return Money;
	}
	
	public int getVehicle() {
		return Vehicle;
	}

}
