package Display;

import java.awt.*;
import javax.swing.*;

public class Display {
	public void display(Displayable body){
		DisplayFrame frame = 
			new DisplayFrame(body.getNameList(),body.getColorList(),
					         body.getTotalCalories(),body.getHealthLevel());
		frame.setSize(300,320);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] arg){
		Display d = new Display();
	}
	
}
