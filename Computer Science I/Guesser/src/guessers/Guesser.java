package guessers;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;
 
public class Guesser extends JFrame {
	private JLabel promptLabel;
	private JTextField input;
	private JLabel outputLabel;
	private int theNumber;
	private boolean player1Guess;
	
	private class CheckGuess implements ActionListener
	{
		public void actionPerformed( ActionEvent e)
		{	int theirGuess = Integer.parseInt(input.getText());
			input.setText("");
			if( player1Guess ) {
				player1Guess = false;
				promptLabel.setText("Second player guess a number 1 and 100");
			}
			else {
				player1Guess = true;
				promptLabel.setText("First player guess a number between 1 and 100");
			}
			if( theirGuess > theNumber ) {
				outputLabel.setText("Too High");
			}
			else if( theirGuess < theNumber ) {
				outputLabel.setText("Too Lowe");
			}
			else //theirGuess == theNumber
			//if (theirGuess == theNumber)
			{
				System.exit(0);
			}
		}
	}

public Guesser() {
	super();
	Container contentPane = getContentPane();
	
	player1Guess = true;
	promptLabel = new JLabel("First Player guess a number between 1 and 100");
	//promptLabel = new JLabel("Type a number between 1 and 100 and press enter");
	input = new JTextField(4);
	input.addActionListener(new CheckGuess() );
	
	JPanel inPanel = new JPanel();
	inPanel.add(promptLabel);
	inPanel.add( input );
	contentPane.add(inPanel,  "North");
	
	outputLabel = new JLabel();
	contentPane.add(outputLabel, "Center");
	
	Random gen = new Random();
	theNumber = gen.nextInt(100)+1;
}

public Guesser(String title) {
	this();
	setTitle(title);
}

}
