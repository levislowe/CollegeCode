package Toll;


import java.awt.*;

import Toll.*;

public class Car implements Booth {
	public int Money;
	public int People;
	public int Vehicle;
	
	public Car(int Money, int People, int Vehicle ) {
		this.Money = Money;	this.People = People;
		this.Vehicle = Vehicle;
	
	}
	
	public int getMoney() {
		return Money;
	}

	public int getPeople() {
		return People;
	}
	
	public int getVehicle() {
		return Vehicle;
	}

}
