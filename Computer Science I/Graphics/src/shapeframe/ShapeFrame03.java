package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Container;

public class ShapeFrame03 extends JFrame {
	private ShapeComponent03 shapeDisplay;
	private JButton circle;
	private JRadioButtonMenuItem circleChoice;
	private JRadioButtonMenuItem squareChoice;
	
	private class DoButtons implements ActionListener {
		public void actionPerformed(ActionEvent e) { 
			if( circleChoice.isSelected() ) {
				shapeDisplay.addCircle();
			}
			else if( squareChoice.isSelected()) {
				shapeDisplay.addSquare();
			}
		}
	}
	private class PutShape implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			double clickX = e.getX();
			double clickY = e.getY();
			if( circleChoice.isSelected() ) {
				shapeDisplay.addCircle(clickX, clickY);
			}
			else if( squareChoice.isSelected()) {
				shapeDisplay.addSquare(clickX, clickY);
			}
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
	public ShapeFrame03() {
		super();
		Container ctPane = getContentPane();
		
		shapeDisplay = new ShapeComponent03();
		shapeDisplay.addMouseListener(new PutShape());
		ctPane.add(shapeDisplay, BorderLayout.CENTER);
		
		circle = new JButton("Shape");
		circle.addActionListener(new DoButtons());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(circle);
		
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
	public ShapeFrame03(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		ShapeFrame03 frame = new ShapeFrame03("The Shape of Things to Come");;
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
