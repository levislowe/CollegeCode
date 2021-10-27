package Toll;

import java.awt.*;
import java.util.*;


public class Agent {
	private int totalmoney;
	private int totalpeople;
	private int totalvehicle;
	
	
	public Agent() {
		totalmoney = 0;
		totalpeople = 0;
		totalvehicle = 0;
		
	}
	
	public void pay( Booth item){
		totalmoney = totalmoney + item.getMoney();
		totalpeople = totalpeople + item.getPeople();
		totalvehicle = totalvehicle + item.getVehicle();
	}

	public int getTotalMoney() {
		return totalmoney;
	}
	
	public int getTotalPeople() {
		return totalpeople;
	}

	public int getTotalVehicle() {
		return totalvehicle;
	}
	
	
}