package graphics;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.geom.*;
import java.awt.event.*;

public class christmasTreeFrame extends JFrame {
	private christmasTree proDisplay;
	
	public christmasTreeFrame() {
		Container ctPane = getContentPane();
		proDisplay = new christmasTree();
		ctPane.add(proDisplay, "Center");
	}
	public christmasTreeFrame(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		christmasTreeFrame frame = new christmasTreeFrame("Christs");
		frame.setSize(400, 450);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
