package graphics;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class Dancer extends JComponent {
	private int leftLeg = 0;
	private int leftArm = 0;
	private int rightLeg = 0;
	private int rightArm = 0;
	
	public Dancer() {
		super();
	}
	public void leftleg() {
		if ( leftLeg == 0) {
			leftLeg = 1;
		}
		else if ( leftLeg == 1 ) {
			leftLeg = 2;
		}
		else if ( leftLeg == 2 ) {
			leftLeg = 3;
		}
		else if ( leftLeg == 3 ) {
			leftLeg = 4;
		}
		else if ( leftLeg == 4 ) {
			leftLeg = 5;
		}
		else if ( leftLeg == 5 ) {
			leftLeg = 6;
		}
		else if ( leftLeg == 6 ) {
			leftLeg = 7;
		}
		else if ( leftLeg == 7 ) {
			leftLeg = 0;
		}
		repaint();
	}
	public void leftarm() {
		if ( leftArm == 0) {
			leftArm = 1;
		}
		else if ( leftArm == 1 ) {
			leftArm = 2;
		}
		else if ( leftArm == 2 ) {
			leftArm = 3;
		}
		else if ( leftArm == 3 ) {
			leftArm = 4;
		}
		else if ( leftArm == 4 ) {
			leftArm = 5;
		}
		else if ( leftArm == 5 ) {
			leftArm = 6;
		}
		else if ( leftArm == 6 ) {
			leftArm = 7;
		}
		else if ( leftArm == 7 ) {
			leftArm = 0;
		}
		System.out.println(leftArm);
		repaint();
		
	}
	public void rightleg() {
		if ( rightLeg == 0) {
			rightLeg = 1;
		}
		else if ( rightLeg == 1 ) {
			rightLeg = 2;
		}
		else if ( rightLeg == 2 ) {
			rightLeg = 3;
		}
		else if ( rightLeg == 3 ) {
			rightLeg = 4;
		}
		else if ( rightLeg == 4 ) {
			rightLeg = 5;
		}
		else if ( rightLeg == 5 ) {
			rightLeg = 6;
		}
		else if ( rightLeg == 6 ) {
			rightLeg = 7;
		}
		else if ( rightLeg == 7 ) {
			rightLeg = 0;
		}
		repaint();
	}
	public void rightarm() {
		if ( rightArm == 0) {
			rightArm = 1;
		}
		else if ( rightArm == 1 ) {
			rightArm = 2;
		}
		else if ( rightArm == 2 ) {
			rightArm = 3;
		}
		else if ( rightArm == 3 ) {
			rightArm = 4;
		}
		else if ( rightArm == 4 ) {
			rightArm = 5;
		}
		else if ( rightArm == 5 ) {
			rightArm = 6;
		}
		else if ( rightArm == 6 ) {
			rightArm = 7;
		}
		else if ( rightArm == 7 ) {
			rightArm = 0;
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
		
		g2D.drawLine(200, 200, 200, 75);
		
		g2D.drawLine(200, 200, 250, 250);
		
		g2D.drawLine(150, 100, 250, 100);
		
		g2D.drawLine(200, 200, 150, 250);
		
		g2D.drawLine(200, 200, 250, 250);
		
		if ( leftLeg == 0 ) {
			g2D.drawLine(150, 250, 100, 300);
		}
		else if ( leftLeg == 1 ) {
			g2D.drawLine(150, 250, 100, 250);
		}
		else if ( leftLeg == 2 ) {
			g2D.drawLine(150, 250, 100, 200);
		}
		else if ( leftLeg == 3 ) {
			g2D.drawLine(150, 250, 150, 200);
		}
		else if ( leftLeg == 4 ) {
			g2D.drawLine(150, 250, 200, 200);
		}
		else if ( leftLeg == 5 ) {
			g2D.drawLine(150, 250, 200, 250);
		}
		else if ( leftLeg == 6 ) {
			g2D.drawLine(150, 250, 200, 300);
		}
		else if ( leftLeg == 7 ) {
			g2D.drawLine(150, 250, 150, 300);
		}
		System.out.println(leftArm);
	
		
		if ( leftArm == 0 ) {
			g2D.drawLine(150, 100, 100, 150);
			
		}
		else if ( leftArm == 1 ) {
			g2D.drawLine(150, 100, 100, 100);
			System.out.println(leftArm);
		}
		else if ( leftArm == 2 ) {
			g2D.drawLine(150, 100, 100, 50);
			System.out.println(leftArm);
		}
		else if ( leftArm == 3 ) {
			g2D.drawLine(150, 100, 150, 50);
			System.out.println(leftArm);
		}
		else if ( leftArm == 4 ) {
			g2D.drawLine(150, 100, 200, 50);
			System.out.println(leftArm);
		}
		else if ( leftArm == 5 ) {
			g2D.drawLine(150, 100, 200, 100);
			System.out.println(leftArm);
		}
		else if ( leftArm == 6 ) {
			g2D.drawLine(150, 100, 200, 150);
			System.out.println(leftArm);
		}
		else if ( leftArm == 7 ) {
			g2D.drawLine(150, 100, 150, 150);
			System.out.println(leftArm);
		}
		if ( rightLeg == 0 ) {
			g2D.drawLine(250, 250, 300, 300);
		}
		else if ( rightLeg == 1 ) {
			g2D.drawLine(250, 250, 300, 250);
		}
		else if ( rightLeg == 2 ) {
			g2D.drawLine(250, 250, 300, 200);
		}
		else if ( rightLeg == 3 ) {
			g2D.drawLine(250, 250, 250, 200);
		}
		else if ( rightLeg == 4 ) {
			g2D.drawLine(250, 250, 200, 200);
		}
		else if ( rightLeg == 5 ) {
			g2D.drawLine(250, 250, 200, 250);
		}
		else if ( rightLeg == 6 ) {
			g2D.drawLine(250, 250, 200, 300);
		}
		else if ( rightLeg == 7 ) {
			g2D.drawLine(250, 250, 250, 300);
		}
		
		if ( rightArm == 0 ) {
			g2D.drawLine(250, 100, 300, 150);
		}
		else if ( rightArm == 1 ) {
			g2D.drawLine(250, 100, 300, 100);
		}
		else if ( rightArm == 2 ) {
			g2D.drawLine(250, 100, 300, 50);
		}
		else if ( rightArm == 3 ) {
			g2D.drawLine(250, 100, 250, 50);
		}
		else if ( rightArm == 4 ) {
			g2D.drawLine(250, 100, 200, 50);
		}
		else if ( rightArm == 5 ) {
			g2D.drawLine(250, 100, 200, 100);
		}
		else if ( rightArm == 6 ) {
			g2D.drawLine(250, 100, 200, 150);
		}
		else if ( rightArm == 7 ) {
			g2D.drawLine(250, 100, 250, 100);
		}
	}
}
