package sweatomatic;

import java.awt.*;

public class Food implements Eatable {
	private String name;
	private Color color;
	private int calories;
	private int healthValue;
	
	public Food(String name, Color color, int calories, int healthValue) {
		this.name = name; this.color = color;
		this.calories = calories; this.healthValue = healthValue;
		
	public int getCalories() {
		return calories;
	}
	
	public int getHealthValue() {
		return 0;
	}
	
	public String getName() {
		return name;
	}
	
	public Color getColor() {
		return color;
	}

	

}
