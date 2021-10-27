

package sweatomatic;

import java.awt.*;

public class Vitamin implements Eatable {
	int healthValue;
	String name;
	Color color;
	
	public int getCalories() {
		return 0;
	}
	public int getHealthValue() {
		return healthValue;
	}
	public String getName() {
		return name;
	}
	public Color getColor() {
		return color;
	}
	
	public Vitamin(int healthValue, String name, Color color){
		this.healthValue = healthValue;
		this.name = name;  		this.color = color;
	}
}







