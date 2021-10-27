package TempConv;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
	private JTextField input1;
	private JTextField output;
	private JButton convert;
	private TempConvertor theConvert;
	
	public Frame() {
		super();
		theConvert = new TempConvertor();
		Container contentPane = getContentPane();
		
		input1 = new JTextField(10);
		JPanel inPanel = new JPanel();
		inPanel.add(input1);
		contentPane.add(inPanel, BorderLayout.NORTH);
		
		output = new JTextField(10);
		contentPane.add(output, BorderLayout.SOUTH);
		
		convert = new JButton("Convert to Celsius");
		convert.addActionListener(new DoConvert());
		contentPane.add(convert, BorderLayout.CENTER);
	}
	
	public Frame(String Title) {
		this();
		setTitle("Temperature Converter");
	}
	
	public class DoConvert implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			theConvert.setInput1(Double.parseDouble(input1.getText()));
			theConvert.convert();
			output.setText(String.valueOf(theConvert.getOutput() + " Celsius"));
		}
	}

}
