package propeller;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.geom.*;
import java.awt.event.*;

public class PropellerFrame extends JFrame {
	private Propeller proDisplay;
	private JButton move;
	private Timer theTimer;
	
	private class Animate implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			proDisplay.go();
		}
	}
	private class StartProp implements ActionListener {
		public void  actionPerformed(ActionEvent arg0) {
			theTimer.start();
		}
	}
	public PropellerFrame() {
		Container ctPane = getContentPane();
		proDisplay = new Propeller();
		ctPane.add(proDisplay, "Center");
		
		move = new JButton("Move");
		move.setFocusable(false);
		move.addActionListener(new StartProp());
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(move);
		ctPane.add(buttonPanel, "South");
		
		theTimer = new Timer(10, new Animate());
	}
	public PropellerFrame(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		PropellerFrame frame = new PropellerFrame("Fly me to the Moon");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
