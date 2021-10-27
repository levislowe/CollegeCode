package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class ShapeComponent01  extends JComponent {
	private Shape theShape;
	private Random ranGen;
	
	public ShapeComponent01() {
		super();
		ranGen = new Random();
	}
	public void addCircle() {
		double diameter = Math.min(getWidth(), getHeight())* ranGen.nextDouble();
		double x = (getWidth()-diameter) * ranGen.nextDouble();
		double y = (getHeight()-diameter) * ranGen.nextDouble();
		
		theShape = new Ellipse2D.Double(x,y,diameter,diameter);
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		g2D.setColor(Color.RED);
		
		if(theShape != null) {
			g2D.fill(theShape);
		}
	}
}
