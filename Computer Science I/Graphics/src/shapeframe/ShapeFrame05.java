package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.geom.*;
import java.awt.event.*;

public class ShapeFrame05 extends JFrame {
	private ShapeComponent05 shapeDisplay;
	private JButton circle;
	private JRadioButtonMenuItem circleChoice;
	private JRadioButtonMenuItem squareChoice;
	private JButton move;
	private Timer theTimer;
	
	private class Animate implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			shapeDisplay.moveShape();
		}
	}
	private class DoButtons implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if( circleChoice.isSelected()) {
				shapeDisplay.addCircle();
			}
			else if( squareChoice.isSelected()) {
				shapeDisplay.addSquare();
			}
			theTimer.start(); 
		} 
	}
	private class PutShape implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			System.out.println(""+e.getButton());
			double clickX = e.getX();
			double clickY = e.getY();
			if( circleChoice.isSelected()) {
				shapeDisplay.addCircle(clickX, clickY);
			}
			else if( squareChoice.isSelected()) {
				shapeDisplay.addSquare(clickX, clickY);
			}
			theTimer.start();
		}
		public void mousePressed(MouseEvent arg0) {
		}
		public void mouseReleased(MouseEvent arg0) {
		}
		public void mouseEntered(MouseEvent arg0) {
		}
		public void mouseExited(MouseEvent arg0) {
		}
	}
	public ShapeFrame05() {
		super();
		Container ctPane = getContentPane();
		
		shapeDisplay = new ShapeComponent05();
		shapeDisplay.addMouseListener(new PutShape());
		ctPane.add(shapeDisplay, BorderLayout.CENTER);
		
		Animate animator = new Animate();
		theTimer = new Timer(20, animator);
		
		circle = new JButton("Cirlce");
		circle.addActionListener(new DoButtons());
		
		move = new JButton("Move");
		move.addActionListener(animator);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(circle);
		buttonPanel.add(move);
		
		ctPane.add(buttonPanel, BorderLayout.SOUTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu shapeMenu = new JMenu("Shapes");
		menuBar.add(shapeMenu);
		
		circleChoice = new JRadioButtonMenuItem("Circle", true);
		squareChoice = new JRadioButtonMenuItem("Square", false);
		shapeMenu.add( circleChoice );
		shapeMenu.add( squareChoice );
		
		ButtonGroup group = new ButtonGroup();
		group.add( circleChoice );
		group.add( squareChoice );
	}
	public ShapeFrame05(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		ShapeFrame05 frame = new ShapeFrame05("The Shape of Things to Come");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

