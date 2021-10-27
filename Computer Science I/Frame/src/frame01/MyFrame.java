package frame01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/* the MyFrame class extends JFrame in order to create a CUI
 * that changes a label to a string "Stop it"
 * 
 * */

public class MyFrame extends JFrame {
	private JButton pushMe;
	private JButton pushMe2;
	private JLabel response;
	private JTextField entry;

	
	public class Action1 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			response.setText("Stop it");
		}
	}
 
	public class Action2 implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String temp = entry.getText();
			response.setText(temp);
		}
	}
	
	public MyFrame() {
		super();
		Container contentPane = getContentPane();
		
	// Create a button
		pushMe = new JButton("Push Me");
		contentPane.add(pushMe, BorderLayout.WEST);
		
		pushMe2 = new JButton("Don't Push Me");
		contentPane.add(pushMe2, BorderLayout.EAST);
	
		Action1 theAction = new Action1();
		pushMe.addActionListener(theAction);
				
		
		pushMe2.addActionListener(new Action2());
		
		response = new JLabel ("Blah blah");
		contentPane.add(response, BorderLayout.NORTH);
		
		entry = new JTextField();
		contentPane.add(entry, BorderLayout.SOUTH);
	}
	
	public MyFrame(String t) {
		this();
		setTitle(t);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Super GUi blah");
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

}
