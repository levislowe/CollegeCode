package colorRectangles;

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
	private int ColorChange = 0;
	
	public void colorChange() {
		if ( ColorChange == 0) {
			ColorChange = 1;
		}
		else if ( ColorChange == 1 ) {
			ColorChange = 2;
		}
		else if ( ColorChange == 2 ) {
			ColorChange = 3;
		}
		else if ( ColorChange == 3 ) {
			ColorChange = 4;
		}
		else if ( ColorChange == 4 ) {
			ColorChange = 5;
		}
		else if ( ColorChange == 5 ) {
			ColorChange = 6;
		}
		else if ( ColorChange == 6 ) {
			ColorChange = 7;
		}
		else if ( ColorChange == 7 ) {
			ColorChange = 0;
		}
		repaint();
	}
	
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
		
		if ( ColorChange == 0 ) {
			g2D.setColor(new Color(255, 192, 203));
		}
		else if ( ColorChange == 1 ) {
			g2D.setColor(new Color(255,   0 ,  0));
		}
		else if ( ColorChange == 2 ) {
			g2D.setColor(new Color(255, 165,   0));
		}
		else if ( ColorChange == 3 ) {
			g2D.setColor(new Color(255, 255,   0));
		}
		else if ( ColorChange == 4 ) {
			g2D.setColor(new Color(165,  42,  42));
		}
		else if ( ColorChange == 5 ) {
			g2D.setColor(new Color(  0,   0, 255));
		}
		else if ( ColorChange == 6 ) {
			g2D.setColor(new Color( 0, 255, 255));
		}
		else if ( ColorChange == 7 ) {
			g2D.setColor(new Color(  0, 128,   0));
		}
	
		if(theShape != null) {
			g2D.fill(theShape);
		}
	}
}
