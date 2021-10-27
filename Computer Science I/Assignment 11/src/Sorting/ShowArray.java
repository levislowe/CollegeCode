package Sorting;

import java.awt.*;
import javax.swing.*;

public class ShowArray extends JComponent {
	private int[] theArray;
	
	public  void setArray(int[] a) {
		theArray = a;
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		
		if(theArray == null)return;
		
		int chunk = getWidth()/theArray.length;
		int yBottom = getHeight();
		double scale = yBottom/100.0;
		
		for(int i = 0; i < theArray.length; i++) {
			int x = (int)(i * chunk + chunk / 2.0);
			int yTop = (int)Math.round(yBottom - theArray[i] * scale);
			
			g2D.drawLine(x, yBottom, x, yTop);
		}
	}
}
