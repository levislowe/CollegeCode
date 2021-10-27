package piglatin;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class WordCounter extends JFrame {
	private JTextArea text;
	private JButton count;
	private JLabel result;
	
	private class DoCount implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			text.setText(PigLatin.convertWord(text.getText()));
			String allTheText = text.getText();
			StringTokenizer tokenizer = new StringTokenizer(allTheText);
			
			int count = 0;
			String PigOut = "";
			while( tokenizer.hasMoreTokens() ) {
				String word = tokenizer.nextToken();
				String PigWord = PigLatin.convertWord(word);
				
				count++;
				PigOut = PigOut + " "+PigWord;
			}
			result.setText("The number words = "+count); 
		}
	}
	public WordCounter() {
		super();
		Container ctPane = getContentPane();
		
		text = new JTextArea();
		text.setLineWrap(true);
		JScrollPane Scroll = new JScrollPane(text);
		ctPane.add(Scroll,  BorderLayout.CENTER);
		
		count = new JButton("Count");
		result = new JLabel("The number of words = ???");
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(count);
		bottomPanel.add(result);
		ctPane.add(bottomPanel, BorderLayout.SOUTH);
		
		count.addActionListener(new DoCount());
	}
	public WordCounter(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		WordCounter frame = new WordCounter("Word Counter");
		frame.setSize(450,450);
		frame.setLocation(200,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
