package Sweat;

import java.awt.*;
import java.util.*;

import Display.*;


public class ClientBody implements Displayable{
	private int totalCalories;
	private int numberOfItems;
	private int healthLevel;
	private ArrayList<String> Names;
	private ArrayList<Color>  Colors;
	
	private static final int CaloriesPerMile = 100;
	
	private static final int totalHoursYoga = 5;
	
	public ClientBody() {
		totalCalories = 0;
		numberOfItems = 0;
		healthLevel = 0;
		Names = new ArrayList<String>();
		Colors = new ArrayList<Color>();
	}
	
	public void eat( Eatable item){
		numberOfItems = numberOfItems + 1;
		totalCalories = totalCalories + item.getCalories();
		healthLevel = healthLevel + item.getHealthValue();
		Names.add(item.getName());
		Colors.add(item.getColor());
	}
	
	public void run( int miles){
		totalCalories = totalCalories - miles * CaloriesPerMile;
	}
	
	public void yoga( int hours){
		healthLevel = healthLevel + hours * totalHoursYoga;
	}
	
	public int getTotalCalories() {
		return totalCalories;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public ArrayList<Color> getColorList() {
		return Colors;
	}

	public ArrayList<String> getNameList() {
		return Names;
	}

}
