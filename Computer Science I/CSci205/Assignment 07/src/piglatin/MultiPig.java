package piglatin;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class MultiPig extends JFrame {
	private JTextArea text;
	private JButton count;
	private JLabel result;
	
	private class DoCount implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String allTheText = text.getText();
			StringTokenizer tokenizer = new StringTokenizer(allTheText);
			
			int count = 0;
			String allTheLatin = "";
			
			while( tokenizer.hasMoreTokens() ) {
				String word = tokenizer.nextToken();
				String piglatin = PigLatin.convertWord(word);
				allTheLatin = allTheLatin + " " + piglatin;
				count++;
			}
			result.setText("The number of Words = " + count);
			text.setText(allTheLatin);
			repaint();
		}
	}
	public MultiPig() {
		super();
		Container ctPane = getContentPane();
		
		text = new JTextArea();
		text.setLineWrap(true);
		JScrollPane Scroll = new JScrollPane(text);
		ctPane.add(Scroll, "Center");
		
		count = new JButton("Count");
		result = new JLabel("The number of words = ???");
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(count);
		bottomPanel.add(result);
		ctPane.add(bottomPanel, "South");
		
		count.addActionListener(new DoCount());
	}
	public MultiPig(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		MultiPig frame = new MultiPig("To Pig Latin!");
		frame.setSize(400,500);
		frame.setLocation(200,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
