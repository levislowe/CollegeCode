package displayomatic;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class DisplayFrame extends JFrame {
	private JTextField totalCalories;
	private	JTextField healthLevel;
	private JPanel listPanel;
		
	public DisplayFrame(ArrayList names, ArrayList colors, int calories, int health) {
	  super();
	  setTitle("Flab-o-Tread II");
	  Container ctPane = getContentPane();
	  listPanel = new JPanel();
	  ctPane.add(listPanel,"Center");
	  Iterator itName = names.iterator();
	  Iterator itColor = colors.iterator();
	  while( itName.hasNext() && itColor.hasNext()){
		  JButton aButton = new JButton((String)itName.next());
		  aButton.setBackground((Color)itColor.next());
		  listPanel.add(aButton);
	  }
	  totalCalories = new JTextField(7);
	  totalCalories.setText(""+calories);
	  healthLevel = new JTextField(7);
	  healthLevel.setText(""+health);
	  JPanel statPanel = new JPanel();
	  JLabel calorieLabel = new JLabel("Calories");
	  statPanel.add(calorieLabel);
	  statPanel.add(totalCalories);
	  JLabel healthlabel = new JLabel("Health");
	  statPanel.add(healthlabel);
	  statPanel.add(healthLevel);
	  ctPane.add(statPanel, "South");
	}
	
}
