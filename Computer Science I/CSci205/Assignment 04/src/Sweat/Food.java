package Sweat;


import java.awt.*;

import Sweat.*;

public class Food implements Eatable {
	int calories;
	int healthValue;
	String name;
	Color color;
	
	public Food(int calories, int healthValue, String name, Color color ) {
		this.calories = calories;	this.healthValue = healthValue;
		this.name = name;  			this.color = color;
	}
	public int getCalories() {
		return calories;
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
