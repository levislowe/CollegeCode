package sweatomatic;

import java.awt.*;

public class BodyTester {

	public static void main(String[] args) {
		ClientBody me = new ClientBody();
		Food twinky = new Food("twinky", Color.yellow, 3000, -200);
		me.eat(twinky);
		Food cheesePuffs = new Food("cheese puffs", Color.orange, 2000, -500);
		me.eat(cheesePuffs);
		Vitamin theBlue = new Vitamin("Blue", Color.blue, 500);
		me.eat(theBlue);
		me.run(3);
		
		System.out.println(me.getTotalCalories());
	
		
	}

}
