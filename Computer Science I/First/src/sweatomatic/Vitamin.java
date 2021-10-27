package sweatomatic;

import java.awt.*;

public class Vitamin implements Eatable {
	private String name;
	private Color color;
	private int healthValue;

	public Vitamin(String name, Color color, int healthValue) {
		this.name = name; this.color = color; this.healthValue = healthValue;
	}
	
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

}
