package piglatin;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class PigFrame extends JFrame {
	private JTextArea text;
	private JButton count;
	private JLabel result;
	
	private class DoConvert implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			text.setText(PigLatin.convertWord(text.getText()));
		}
	}
	
	private class DoCount implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
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
		
			text.setText(PigLatin.convertWord(text.getText()));
		}
	}
	public PigFrame() {
		super();
		Container ctPane = getContentPane();
		ctPane.setLayout(new FlowLayout());
		
		text = new JTextArea();
		text.setLineWrap(true);
		JScrollPane Scroll = new JScrollPane(text);
		ctPane.add(Scroll,  BorderLayout.CENTER);
		
		count.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(PigLatin.convertWord(text.getText()));
			}
		});
		
		count = new JButton("Count");
		result = new JLabel("The number of words = ???");
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(count);
		bottomPanel.add(result);
		ctPane.add(bottomPanel, BorderLayout.SOUTH);
		
		count.addActionListener(new DoCount());
		count.addActionListener(new DoConvert());
	}
	public PigFrame(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		WordCounter frame = new WordCounter("Ig-pay Atin-Lay");
		frame.setSize(450,450);
		frame.setLocation(200,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}