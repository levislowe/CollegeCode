package Sorting;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class ListFrame extends JFrame {
	private ShowArray display1;
	private ShowArray display2;
	private int[] array1 = new int[100];
	private int[] array2 = new int[100];
	private int leftToSort = array1.length;
	private int rightToSort = array2.length;
	private Timer theTimer;
	private Timer bubbleTimer;
	

	public void bubbleSort (Object[] objArray) {
		boolean sorted = false;
		int oneLessLength = objArray.length - 1;
		Object temp;
		
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < oneLessLength; i++) {
				if( ((Comparable)objArray[i]).compareTo(objArray[i + 1]) > 0 ) {
					temp = objArray[i];
					objArray[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}
	public void selectionSort() {
		if(leftToSort > 0) {
			int maxIndex = 0;
			for(int i = 1; i <  leftToSort; i++) {
				if(array1[i] > array1[maxIndex]) {
					maxIndex = i;
				}
			}
			leftToSort--;
			
			int temp = array1[maxIndex];
			array1[maxIndex] = array1[leftToSort];
			array1[leftToSort] = temp;
		}
	}
	private class DoSorts implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			selectionSort();
			repaint();
		}
	}
	public ListFrame() {
		super();
		Container ctPane = getContentPane();
		ctPane.setLayout(new GridLayout(3, 1));
		display1 = new ShowArray();
		display2 = new ShowArray();
		
		Random gen = new Random();
		
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i] = gen.nextInt(100);
		}
		for(int i = 0; i < array2.length; i++) {
			array1[1] = array2[1] = gen.nextInt(100);
		}
		display1.setArray(array1);
		display2.setArray(array2);
		
		ctPane.add(display1);
		ctPane.add(display2);
		
		JButton onePass = new JButton("Do Once");
		JButton startTimer = new JButton("Start");
		startTimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theTimer.start();
			}
		});
		DoSorts callSort = new DoSorts();
		onePass.addActionListener(callSort);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(onePass);
		buttonPanel.add(startTimer);
		ctPane.add(buttonPanel);
		
		theTimer = new Timer(200,callSort);
	}
	public ListFrame(String title) throws HeadlessException {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		ListFrame frame = new ListFrame("List Master");
		frame.setSize(400,400);
		frame.setLocation(200,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
