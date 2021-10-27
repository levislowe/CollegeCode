package sweatomatic;

import java.awt.*;
import java.util.*;

import displayomatic.*;


public class ClientBody implements Displayable{
	private int totalCalories;
	private int numberOfItems;
	private int healthLevel;
	private ArrayList<String> Names;
	private ArrayList<Color>  Colors;
	
	private static final int CaloriesPerMile = 100;
	
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
	
	@Override
	public int getTotalCalories() {
		// TODO Auto-generated method stub
		return totalCalories;
	}

	@Override
	public int getHealthLevel() {
		// TODO Auto-generated method stub
		return healthLevel;
	}

	@Override
	public int getNumberOfItems() {
		// TODO Auto-generated method stub
		return numberOfItems;
	}

	@Override
	public ArrayList<Color> getColorList() {
		// TODO Auto-generated method stub
		return Colors;
	}

	@Override
	public ArrayList<String> getNameList() {
		// TODO Auto-generated method stub
		return Names;
	}

}
