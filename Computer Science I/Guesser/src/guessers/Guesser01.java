package guessers;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class Guesser01 extends JFrame {
	private JLabel PromptLabel;
	private JTextField Input;
	private JLabel OutputLabel;
	private int TheNumber;
	
	private class CheckGuess implements ActionListener
	{
		public void actionPerformed( ActionEvent e)
		{	int theirGuess = Integer.parseInt(Input.getText());
			Input.setText("");
			
			if( theirGuess > TheNumber ) {
				OutputLabel.setText("Too High");
			}
			else if( theirGuess < TheNumber ) {
				OutputLabel.setText("To Low");
			}
			else
				OutputLabel.setText("You Win!");
		}
	}
	
	public Guesser01() {
		super();
		Container contentPane = getContentPane();
		
		PromptLabel = new JLabel("Type in a number between 1 and 100 and press enter");
		Input = new JTextField(4);
		Input.addActionListener(new CheckGuess());
		
		JPanel inPanel = new JPanel();
		inPanel.add(PromptLabel);
		inPanel.add( Input );
		contentPane.add(OutputLabel,BorderLayout.NORTH);
		
		OutputLabel = new JLabel();
		contentPane.add(OutputLabel,BorderLayout.CENTER);
		
		Random gen = new Random();
		TheNumber = gen.nextInt(100)+1;
	}
	
	public Guesser01(String title) {
		this();
		setTitle(title);
	}

}

