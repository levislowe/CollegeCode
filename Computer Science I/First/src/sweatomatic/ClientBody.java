package sweatomatic;

import java.awt.*;
import java.util.ArrayList;

public class ClientBody implements Displayable {
	private int totalCalories;
	private int numberOfItems;
	private int healthLevel;
	private ArrayList<String> Names;
	private ArrayList<Color> Colors;
	private static final int CaloriesPerMile = 100;
	
	public ClientBody() {
		totalCalories = 0;
		numberOfItems = 0;
		healthLevel = 0;
		Names = new ArrayList<String>();
		Color = new Array<Color>();
	}
	public ArrayList<Color> getColorList() {
		return Colors;
	}
	public int getHealthLevel() {
		return healthLevel;
	}
	public ArrayList<String> getNameList() {
		return Names;
	}
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public int getTotalCalories() {
		return totalCalories;
	}
	
	public void eat( Eatable item) {
		numberOfItems = numberOfItems + 1;
		totalCalories = totalCalories + item.getCalories();
		healthLevel = healthLevel + item.getHealthValue();
		Names.add(item.getName());
		Colors.add(item.getColor());
	}
	
	public void run( int miles) {
		totalCalories = totalCalories - miles * CaloriesPerMile;
		healthLevel = 300;
	}
}
