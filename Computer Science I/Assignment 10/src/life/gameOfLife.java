package life;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class gameOfLife extends JComponent {
	private boolean[] [] dots;
	private final int gridSize;
	private Random gen;
	private Color color = Color.black;
	
	public gameOfLife() {
		super();
		gridSize = 20;
		dots = new boolean[gridSize] [gridSize];
		gen = new Random();
		
		for(int row = 0; row < gridSize; row++) {
			for(int col = 0; col < gridSize; col++) {
				dots[row] [col] = gen.nextBoolean();
			}
		}
	}
	public void nextGen() {
		boolean[] [] newdots = new boolean[gridSize] [gridSize];
		
		for(int row = 0; row < gridSize; row++) {
			for(int col = 0; col < gridSize; col++) {
				int count = 0;
				if(row - 1 >= 0 && col - 1 >= 0 && dots[row - 1] [col - 1]) {
					count++;
				}
				if(row - 1 >= 0 && dots[row - 1] [col]) {
					count++;
				}
				if(row - 1 >= 0 && col + 1 < gridSize && dots[row - 1] [col + 1]) {
					count++;
				}
				if(dots[row] [col - 1]) {
					count++;
				}
				if(dots[row] [col + 1]) {
					count++;
				}
				if(dots[row + 1] [col - 1]) {
					count++;
				}
				if(dots[row + 1] [col]) {
					count++;
				}
				if(dots[row + 1] [col + 1]) {
					count++;
				}
				if(count == 3) {
					newdots[row] [col] = true;
				}
				else if(count == 2) {
					newdots[row] [col] = dots[row] [col];
				}
				else {
					newdots[row] [col] = false;
				}
			}
		}
			dots = newdots;
			repaint();
	}//*/
	public void setDot(double x, double y) {
		double squareWidth = getWidth() / (double) gridSize;
		double squareHeight = getHeight() / (double) gridSize;
		
		int col = (int)(x / squareWidth);
		int row = (int)(y / squareHeight);
		
		if(dots[row] [col]) {
			dots[row] [col] = false;
		}
		else {
			dots[row] [col] = true;
		}
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		
		double squareWidth = getWidth() / (double) gridSize;
		double squareHeight = getHeight() / (double) gridSize;
		
		for(int row = 0; row < gridSize; row++) {
			for(int col = 0; col < gridSize; col++) {
				if(dots[row] [col]) {
					double x = col * squareWidth;
					double y = row * squareHeight;
					
					g2D.fill(new Ellipse2D.Double(x, y, squareWidth, squareHeight));
				}
			}
		}
	}
}
