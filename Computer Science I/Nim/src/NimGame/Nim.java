 package NimGame;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class Nim extends JFrame {
	public class DoButton implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			int youInt = Integer.parseInt(youField.getText());
			if(youInt <= numOPebbles/2 ) {
				numOPebbles = numOPebbles - youInt;
				int computerTakes = 1;
				if(numOPebbles > 31) {
					computerTakes = numOPebbles - 31;
				}
				else if( numOPebbles == 31) {
					computerTakes = 1;
				}
				else if( numOPebbles > 15) {
					computerTakes = numOPebbles - 15;
 				}
				numOPebbles = numOPebbles - computerTakes;
				iField.setText(""+computerTakes);
				leftField.setText(""+numOPebbles);
			}
			else{
			}
		}
	}
	private JLabel leftLabel;
	private JTextField leftField;
	private JLabel youLabel;
	private JTextField youField;
	private JButton youButton;
	private JLabel iLabel;
	private JTextField iField;
	private JTextField winner;
	
	private int numOPebbles;
	private Random gen;
	
	public Nim() {
		super();
		gen = new Random();
		numOPebbles = 9+gen.nextInt(42);
		
		Container ctPane = getContentPane();
		ctPane.setLayout(new GridLayout(4, 1));
		
		JPanel leftPanel = new JPanel();
		leftLabel = new JLabel("Pebbles Left");
		leftField = new JTextField(6);
		leftField.setText(""+numOPebbles);
		leftPanel.add(leftLabel);
		leftPanel.add(leftField);
		ctPane.add(leftPanel);
		
		JPanel youPanel = new JPanel();
		youLabel = new JLabel("You Take");
		youField = new JTextField(6);
		youButton = new JButton("Go");
		youButton.addActionListener(new DoButton());
		youPanel.add(youLabel);
		youPanel.add(youField);
		youPanel.add(youButton);
		ctPane.add(youPanel);
		
		JPanel iPanel = new JPanel();
		iLabel = new JLabel("I Take");
		iField = new JTextField(6);
		iPanel.add(iLabel);
		iPanel.add(iField);
		ctPane.add( iPanel);
	}
	public static void main(String[] args) {
		Nim frame = new Nim();
		frame.setSize(250,300);
		frame.setVisible(true);  
	}
//	
//	JLabel numOSticksLabel;
//	JLabel youTakeLabel;
//	JLabel compTakeLabel;
//	JLabel nowNumOSticksLabel;
//	JLabel iTakeLabel;
//	JButton go;
//	JTextField userTakes;
//	int numOSticks;
//	Random gen;
//	
//	private class DoGo implements ActionListener {
//		
//		public void actionPerformed(ActionEvent arg0) {
//			int userTakesInt = Integer.parseInt(userTakes.getText());
//			
//			if(userTakesInt <= numOSticks/2) {
//				numOSticks = numOSticks - userTakesInt;
//				nowNumOSticksLabel.setText("     The Number of Sticks Left is "+numOSticks);
//				if(numOSticks > 20) {
//					numOSticks = numOSticks - gen.nextInt(10);
//				}
//				else if(numOSticks > 5) {
//					numOSticks = numOSticks - gen.nextInt(5);
//				}
//				else {
//					numOSticks = numOSticks - 1;
//				}
//					
//				
//				int compTakesInt = 0;
//				
//				if(numOSticks>31) {
//					compTakesInt = numOSticks - 31;
//				}
//				else if(numOSticks == 31) {
//					compTakesInt = 1;
//				}
//				else if(numOSticks>15) {
//				}
//			}
//		}
//	}
//	public Nim() {
//		gen = new Random();
//		numOSticks = 100;
//		
//		Container ctp = getContentPane();
//		ctp.setLayout(new GridLayout(4,1));
//		
//		numOSticksLabel = new JLabel();
//		numOSticksLabel.setText("      The Number of sticks is "+numOSticks);
//		ctp.add(numOSticksLabel);
//		
//		JPanel userPanel = new JPanel();
//		youTakeLabel = new JLabel();
//		youTakeLabel.setText("Enter how many to remove:");
//		userPanel.add(youTakeLabel);
//		userTakes = new JTextField(7);
//		userPanel.add(userTakes);
//		go = new JButton("GO!");
//		go.addActionListener(new DoGo());
//		userPanel.add(go);
//		ctp.add(userPanel);
//		
//		nowNumOSticksLabel = new JLabel();
//		nowNumOSticksLabel.setText("     The number of sticks left is ");
//		ctp.add(nowNumOSticksLabel);
//		
//		iTakeLabel = new JLabel(); 
//		iTakeLabel.setText("     I'm taking" + userTakes.getText());
//		ctp.add(iTakeLabel);
//	}
//	public static void main(String[] args) {
//		Nim frame = new Nim();
//		frame.setSize(350,280);
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//	}
}
