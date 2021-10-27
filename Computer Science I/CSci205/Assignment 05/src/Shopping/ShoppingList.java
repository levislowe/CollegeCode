package Shopping;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class ShoppingList extends JFrame {
	private JButton Add;
	private JButton Purchase;
	private JButton Clear;
	private JTextArea response;
	private JTextField entry;
	
	public class MyWindowListener implements WindowListener {
		public void windowActivated(WindowEvent arg0) {
			System.out.println("Activated");
			setTitle("Shopping List");
			
		}
		public void windowClosed(WindowEvent arg0) {
			System.out.println("Closed");
		}
		public void windowClosing(WindowEvent arg0) {
			System.out.println("Closing");
		}
		public void windowDeactivated(WindowEvent arg0) {
			System.out.println("Deactivated");
		}
		public void windowDeiconified(WindowEvent arg0) {
			System.out.println("Deiconified");
		}
		public void windowIconified(WindowEvent arg0) {
			System.out.println("Iconified");
		}
		public void windowOpened(WindowEvent arg0) {
			System.out.println("Opened");
		}
	}
	
	private class AddButton implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			response.append(entry.getText() + ", ");
		}
	}
	
	private class PurchaseButton implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			response.setText("You have bought your items!");
		}
	}
	
	private class ClearButton implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			response.setText("");
		}
	}
	
	public ShoppingList() {
		super();
		MyWindowListener push1 = new MyWindowListener();
		addWindowListener(push1);
		Container contentPane = getContentPane();
		
		Add = new JButton ("Add To List");
		contentPane.add(Add,  BorderLayout.WEST);
		
		AddButton Button = new AddButton();
		Add.addActionListener(Button);
		
		Purchase = new JButton ("Purchase");
		contentPane.add(Purchase,  BorderLayout.EAST);
		
		PurchaseButton theButton = new PurchaseButton();
		Purchase.addActionListener(theButton);
		
		Clear = new JButton ("Clear");
		contentPane.add(Clear,  BorderLayout.CENTER);
		
		ClearButton aButton = new ClearButton();
		Clear.addActionListener(aButton);
		
		response = new JTextArea();
		contentPane.add(response, BorderLayout.SOUTH);
		
		entry = new JTextField(10);
		contentPane.add(entry, BorderLayout.NORTH);
	}

}
