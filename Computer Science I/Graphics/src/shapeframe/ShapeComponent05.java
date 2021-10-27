package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class ShapeComponent05 extends JComponent {
	private Shape theShape;
	private Random ranGen;
	private double xChange = 0.0;
	private double yChange = 0.0;
	double x = 0.0;
	double y = 0.0;
	double size = 30.0;
	
	public ShapeComponent05() {
		super();
		ranGen = new Random();
		xChange = 5*ranGen.nextDouble() + 1;
		yChange = 5*ranGen.nextDouble() + 1;
	}
	public void moveShape() {
		x = x + xChange;	y = y + yChange;
		
		if( x + size >= getWidth() || x <= 0) {
			xChange = -xChange;
			size = size * 0.1;
		}
		if( y + size >= getHeight() || y <= 0) {
			yChange = -yChange;
			size = size * 0.1;
		}
		System.out.println("x="+x+" y="+y+" Xc"+xChange);
		
		if ( theShape instanceof Ellipse2D.Double) {
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
		size = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();
		x = (getWidth()-size) * ranGen.nextDouble();
		y = (getHeight()-size) * ranGen.nextDouble();
		
		theShape = new Ellipse2D.Double(x,  y, size, size);
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
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.setRenderingHint (RenderingHints.KEY_ANTIALIASING,
								RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		g2D.setColor(Color.RED);
		
		if(theShape != null) {
			g2D.fill(theShape);
		}
		g2D.setFont(new Font("Serif", Font.PLAIN, 18));
		g2D.drawString("Weeeeeeeee!", (float)x, (float)y);
	}
}
