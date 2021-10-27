package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class ShapeFrame02 extends JFrame {
	private ShapeComponent02 shapeDisplay;
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
	public ShapeFrame02() {
		super();
		Container ctPane = getContentPane();
		
		shapeDisplay = new ShapeComponent02();
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
		
		circleChoice = new JRadioButtonMenuItem("Circle",true);
		squareChoice = new JRadioButtonMenuItem("Square",false);
		shapeMenu.add( circleChoice );
		shapeMenu.add( squareChoice );
		
		ButtonGroup group = new ButtonGroup();
		group.add( circleChoice );
		group.add( squareChoice );
	}
	public ShapeFrame02(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		ShapeFrame02 frame = new ShapeFrame02("The Shape of Things to Come");;
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
