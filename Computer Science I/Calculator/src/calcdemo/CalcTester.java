package calcdemo;

import java.awt.*;
import javax.swing.WindowConstants;

public class CalcTester {
	
	public static void main(String[] args) {
		Calc2Frame frame = new Calc2Frame("Mr. Calculator");
		frame.setSize(300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	}

}
