package guessers;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class Guesser02 extends JFrame {
	private JLabel promptLabel;
	private JTextField input;
	private JLabel outputLabel;
	private int theNumber;
	
	public Guesser02() {
		Container ctPane = getContentPane();
		promptLabel = new JLabel ("a description");
		
		input = new JTextField(11);
		
		JPanel inPanel = new JPanel();
		inPanel.add(promptLabel);
		inPanel.add(input);
		ctPane.add(inPanel, BorderLayout.CENTER);
		
		Random gen = new Random();
		theNumber = gen.nextInt(100)+1;
		
	}
	
	
	
	public static void main(String[] args) {
		Guesser02 frame = new Guesser02();
		frame.setSize(450,120);
		frame.setVisible(true);
		
	}

}
