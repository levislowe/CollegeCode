package graphics;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class DancerFrame extends JFrame {
	private Dancer proDancer;
	private JButton leftleg;
	private JButton leftarm;
	private JButton rightleg;
	private JButton rightarm;
	private Timer TimeLeftLeg;
	private Timer TimeLeftArm;
	private Timer TimeRightLeg;
	private Timer TimeRightArm;
	
	private class LeftlegAnimate implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			proDancer.leftleg();
		}
	}
	private class LeftarmAnimate implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			proDancer.leftarm();
			
		}
	}
	private class RightlegAnimate implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			proDancer.rightleg();
		}
	}
	private class RightarmAnimate implements ActionListener {
			public void actionPerformed(ActionEvent arg0) {
				proDancer.rightarm();
		}
	}
	private class StartLeftLeg implements ActionListener {
		public void  actionPerformed(ActionEvent arg0) {
			TimeLeftLeg.start();
		
		}
	}
	private class StartLeftArm implements ActionListener {
		public void  actionPerformed(ActionEvent arg0) {
			TimeLeftArm.start();
			
		}
	}
	private class StartRightLeg implements ActionListener {
		public void  actionPerformed(ActionEvent arg0) {
			TimeRightLeg.start();
			
		}
	}
	private class StartRightArm implements ActionListener {
		public void  actionPerformed(ActionEvent arg0) {
			TimeRightArm.start();
			System.out.println("RightArm");
		}
	}
	public DancerFrame() {
		Container ctPane = getContentPane();
		proDancer = new Dancer();
		ctPane.add(proDancer, "Center");;
		
		leftleg = new JButton("Left Leg");
		leftarm = new JButton("Left Arm");
		rightleg = new JButton("Right Leg");
		rightarm = new JButton("Right Arm");
		leftleg.setFocusable(false);
		leftarm.setFocusable(false);
		rightleg.setFocusable(false);
		rightarm.setFocusable(false);
		leftleg.addActionListener(new StartLeftLeg());
		leftarm.addActionListener(new StartLeftArm());
		rightleg.addActionListener(new StartRightLeg());
		rightarm.addActionListener(new StartRightArm());
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(leftleg);
		buttonPanel.add(leftarm);
		buttonPanel.add(rightleg);
		buttonPanel.add(rightarm);
		ctPane.add(buttonPanel, "South");
		
		TimeLeftLeg = new Timer(20, new LeftlegAnimate());
		TimeLeftArm = new Timer(20, new LeftarmAnimate());
		TimeRightLeg = new Timer(20, new RightlegAnimate());
		TimeRightArm = new Timer(50, new RightarmAnimate());
	}
	public DancerFrame(String title) {
		this();
		setTitle(title);
	}
	public static void main(String[] args) {
		DancerFrame frame = new DancerFrame("Dance Little Man!");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
