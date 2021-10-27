package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;

public class ShapeComponent02 extends JComponent {
	private Shape theShape;
	private Random ranGen;
	
	public ShapeComponent02() {
		super();
		ranGen = new Random();
	}
	public void addSquare() {
		double x = getWidth() * ranGen.nextDouble();
		double y = getHeight() * ranGen.nextDouble();
		double edge = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();
		
		theShape = new Rectangle2D.Double(x, y, edge, edge);
		repaint();
	}
	public void addCircle() {
		double x = getWidth() * ranGen.nextDouble();
		double y = getHeight() * ranGen.nextDouble();
		double diameter = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();
		
		theShape = new Ellipse2D.Double(x, y, diameter, diameter);
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		g2D.setColor(Color.RED);
	
		if(theShape != null) {
			g2D.fill(theShape);
		}
	}
}
