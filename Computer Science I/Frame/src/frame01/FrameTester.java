package frame01;

import javax.swing.*;

public class FrameTester {
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

}
