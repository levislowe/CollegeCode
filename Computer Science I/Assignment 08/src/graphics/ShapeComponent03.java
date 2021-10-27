package graphics;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class ShapeComponent03 extends JComponent {
	private Shape theShape;
	private Random ranGen;
	
	public ShapeComponent03() {
		super();
		ranGen = new Random();
	}
	public void clear() {
		theShape = null;
		repaint();
	}
	public void addSquare() {
		double x = getWidth() * (ranGen.nextDouble());
		double y = getHeight() * ranGen.nextDouble();
		double edge = Math.min(getWidth(),  getHeight()) * ranGen.nextDouble();
		
		theShape = new Rectangle2D.Double(x, y, edge, edge);
		repaint();
	}
	public void addSquare(double x, double y) {
		double edge = Math.min(getWidth(), getHeight()) * ranGen.nextDouble();
		
		theShape = new Rectangle2D.Double(x, y, edge, edge);
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
