package Toll;

import java.awt.*;

public class TollTester {

	public static void main(String[] args) {
		Agent me = new Agent();
		Car CToll = new Car(15, 15, 3 );
		me.pay(CToll);
		
		Truck TToll = new Truck(36, 13, 5 );
		me.pay(TToll);
				
		Bus BToll = new Bus(100, 50, 11 );
		me.pay(BToll);
		
		System.out.println("$" + me.getTotalMoney());
		System.out.println(me.getTotalPeople() + " People");
		System.out.println(me.getTotalVehicle() + " Vehicle");
	}
}
