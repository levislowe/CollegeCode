package demotester;

import java.util.*;

public class Demotester {
	public static void main(String[] args) {
		System.out.println(true);
		
		
		System.out.println(5>2);
		System.out.println(7<2);
		System.out.println(65.321>100.1);
		System.out.println(6 == 6);
		System.out.println(6 == 7);
		
		
		Random gen = new Random();
		int x = gen.nextInt(100);
		
		System.out.println(x>50);
		System.out.println(x<20);
		System.out.println(x==40);
		System.out.println(x>70);
		System.out.println(x);
		
		
		if(x > 50) {
			System.out.println( "Not Bad" );
		}
		if(x < 30) {
			System.out.println( "Low Shot" );
		}
		if(x > 70) {
			System.out.println( "Looking Good" );
		}
		
	}

}
