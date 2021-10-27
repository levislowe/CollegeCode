package graphics;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class christmasTree extends JComponent{
	public christmasTree() {
		super();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setStroke(new BasicStroke(10));
		g2D.setColor(Color.green);
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		
		g2D.drawLine(100, 300, 300, 300);
				
		g2D.drawLine(100, 300, 200, 50);
		
		g2D.drawLine(300, 300, 200, 50);
		
		g2D.setColor(new Color(139,69,19));
		
		g2D.drawLine(175, 300, 175, 350);
		
		g2D.drawLine(225, 300, 225, 350);
		
		g2D.drawLine(175, 350, 225, 350);
	}
}