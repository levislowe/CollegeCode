package life;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class gameOfLifeFrame extends JFrame {
	private gameOfLife dotDisplay;
	private Timer timer;
	private Random gen;
	
	private class doTwinkle implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			dotDisplay.nextGen();
		}
	}
	private class PutDot implements MouseListener {
		public void mouseClicked(MouseEvent arg0) {
			double clickX = arg0.getX();
			double clickY = arg0.getY();
			dotDisplay.setDot(clickX, clickY);
		}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mousePressed(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}
	}
	public gameOfLifeFrame() {
		super();
		Container ctPane = getContentPane();
		dotDisplay = new gameOfLife();
		dotDisplay.addMouseListener(new PutDot());
		ctPane.add(dotDisplay,  "Center");
		timer = new Timer(10, new doTwinkle());
		timer.start();
	}
	public gameOfLifeFrame(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		gameOfLifeFrame frame = new gameOfLifeFrame("Another Product");
		frame.setSize(500,500);
		frame.setLocation(200,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
