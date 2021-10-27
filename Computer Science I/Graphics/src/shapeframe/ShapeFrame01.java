package shapeframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class ShapeFrame01 extends JFrame {
	private ShapeComponent01 shapeDisplay;
	private JButton circle;
	private class DoButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			shapeDisplay.addCircle();
		}
	}
	public ShapeFrame01() {
		super();
		Container ctPane = getContentPane();
		
		shapeDisplay = new ShapeComponent01();
		//shapeDisplay.addActionListener(new DoButton());
		ctPane.add(shapeDisplay, BorderLayout.CENTER);
		
		circle = new JButton("Circle");
		circle.addActionListener(new DoButton());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(circle);
		
		ctPane.add(buttonPanel, BorderLayout.SOUTH);
	}
	public ShapeFrame01(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		ShapeFrame01 frame = new ShapeFrame01 ("The Shape of Things");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
