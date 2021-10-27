package propeller;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class Propeller extends JComponent {
	private int step = 0;
	
	public Propeller() {
		super();
	}
	public void go() {
		if ( step == 0) {
			step = 1;
		}
		else if ( step == 1 ) {
			step = 2;
		}
		else if ( step == 2 ) {
			step = 3;
		}
		else if ( step == 3 ) {
			step = 4;
		}
		else if ( step == 4 ) {
			step = 5;
		}
		else if ( step == 5 ) {
			step = 0;
		}
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setStroke(new BasicStroke(10));
		g2D.setColor(Color.red);
		g2D.setBackground(Color.black);
		g2D.clearRect(0, 0, getWidth(), getHeight());
		
		if ( step == 0 ) {
			g2D.drawLine(100, 200, 300, 200);
		}
		else if ( step == 1 ) {
			g2D.drawLine(114, 150, 286, 250);
		}
		else if ( step == 2 ) {
			g2D.drawLine(150, 114, 250, 286);
		}
		else if ( step == 3 ) {
			g2D.drawLine(200, 100, 200, 300);
		}
		else if ( step == 4 ) {
			g2D.drawLine(250, 114, 150, 286);
		}
		else if ( step == 5 ) {
			g2D.drawLine(286, 150, 114, 250);
		}
	}
}
