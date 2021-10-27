package calcdemo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;

public class Calc2Frame extends JFrame {
	private JTextField input1;
	private JTextField input2;
	private JTextField output;
	
	private JButton add;
	private JButton subtract;
	private JButton multiply;
	private JButton divide;
	
	private Calc2 theCalc;
	
	public class ActionAdd implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double in1 = Double.parseDouble(input1.getText());
			double in2 = Double.parseDouble(input2.getText());
			theCalc.setIn1(in1);
			theCalc.setIn2(in2);
			theCalc.add();
			output.setText(""+theCalc.getout());
		
		}

	}
	public class ActionSubtract implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double in1 = Double.parseDouble(input1.getText());
			double in2 = Double.parseDouble(input2.getText());
			theCalc.setIn1(in1);
			theCalc.setIn2(in2);
			theCalc.subtract();
			output.setText(""+theCalc.getout());
		}
	}
	public class ActionMultiply implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double in1 = Double.parseDouble(input1.getText());
			double in2 = Double.parseDouble(input2.getText());
			theCalc.setIn1(in1);
			theCalc.setIn2(in2);
			theCalc.multiply();
			output.setText(""+theCalc.getout());
		}


	}
	public class ActionDivide implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double in1 = Double.parseDouble(input1.getText());
			double in2 = Double.parseDouble(input2.getText());
			theCalc.setIn1(in1);
			theCalc.setIn2(in2);
			theCalc.divide();
			output.setText(""+theCalc.getout());
		}
	}
	
	public Calc2Frame() {
		super();
		theCalc = new Calc2();
		
		Container ctPane = getContentPane();
		input1 = new JTextField(10);
		input2 = new JTextField(10);
		JPanel inPanel = new JPanel();
		inPanel.add(input1); inPanel.add(input2);
		ctPane.add(inPanel,BorderLayout.NORTH);
		
		output = new JTextField(10);
		JPanel outPanel = new JPanel();
		outPanel.add(output);
		ctPane.add(outPanel,BorderLayout.CENTER);
		
		add = new JButton("+");
		add.addActionListener(new ActionAdd());
		subtract = new JButton("-");
		subtract.addActionListener(new ActionSubtract());
		multiply = new JButton("X");
		multiply.addActionListener(new ActionMultiply());
		divide = new JButton("/");
		divide.addActionListener(new ActionDivide());
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(add);
		buttonPanel.add(subtract);
		buttonPanel.add(multiply);
		buttonPanel.add(divide);
		
		ctPane.add(buttonPanel, BorderLayout.SOUTH);
	}
	public Calc2Frame(String title) {
		this();
		setTitle(title);
	}
	

}
