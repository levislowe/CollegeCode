package sweatomatic;
 
import java.awt.*;
import displayomatic.*;

public class SweatTester {

	public static void main(String[] args) {
		ClientBody me = new ClientBody();
		Food twinky = new Food(3000, -200, "twinky",Color.YELLOW );
		me.eat(twinky);
		
		Food cheesePuffs = new Food(2000, -500, "cheese puffs", Color.orange );
		me.eat(cheesePuffs);
				
		Vitamin theBluePill = new Vitamin(710,"super multi", Color.BLUE);
		me.eat(theBluePill);
		
		me.run(3);
		
		Display flabOut = new Display();
		flabOut.display(me);
		
		System.out.println(me.getNumberOfItems());//*/
	}
}








