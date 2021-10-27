package Characters;

import Characters.Hyrule;

public class HyruleTest {
	
	public static void main(String[] args) {
		Hyrule Mob = new Hyrule("Bokobolin");
		Mob.setchar02("Ganon");
		
		Hyrule Call = new Hyrule("Dark Link");
		System.out.println(Call.getchar01());
		System.out.println(Call.getchar02());
		
		Call.setchar01("Link");
		Call.setchar02("Zelda");
		
		System.out.println("Black Haired:" + Call.getchar01());
		System.out.println("Blonde Haired:" + Call.getchar02());
		
		System.out.println("Mob:" + Mob.getchar01());
		System.out.println("Mob:" + Mob.getchar02());
	}

}
