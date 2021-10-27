package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class ShapeComponent04 extends JComponent {
	private Shape theShape;
	private Random ranGen;
	private double xChange = 5.0;
	private double yChange = 5.0;
	double x = 0.0;
	double y = 0.0;
	double size = 0.0;
	
	public ShapeComponent04() {
		super();
		ranGen = new Random();
	}
	public void moveShape() {
		x = x + xChange;	y = y + yChange;
		if( theShape instanceof Ellipse2D.Double) {
			theShape = new Ellipse2D.Double(x, y, size, size);
		}
		else if( theShape instanceof Rectangle2D.Double) {
			theShape = new Rectangle2D.Double(x, y, size, size);
		}
		repaint();
	}
	public void addSquare() {
		x = getWidth() * ranGen.nextDouble();
		y = getHeight() * ranGen.nextDouble();
		size = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();
		
		theShape = new Rectangle2D.Double(x, y, size, size);
		repaint();
	}
	public void addCircle() {
		x = getWidth() * ranGen.nextDouble();
		y = getHeight() * ranGen.nextDouble();
		size = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();
		
		theShape = new Ellipse2D.Double(x, y, size, size);
		repaint();
	}
	public void addCircle(double x, double y) {
		this.x = x;	this.y = y;
		size = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();
			x = x - size/2;
			y = y - size/2;
		theShape = new Ellipse2D.Double(x, y, size, size);
		repaint();
	}
	public void addSquare(double x, double y) {
		this.x = x;	this.y = y;
		size = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();

		theShape = new Rectangle2D.Double(x, y, size, size);
		repaint();
	}
	public void paintComponent (Graphics g) {
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
