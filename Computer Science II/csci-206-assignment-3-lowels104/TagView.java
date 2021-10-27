import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TagView extends JPanel implements KeyListener, MouseMotionListener, ActionListener {// we get keypresses,
                                                                                                 // mouse positions, and
                                                                                                 // button clicks

    private boolean debug = false;
    private int lastKey = 0;
    private int lastX = 0;
    private int lastY = 0;
    private final int spriteSizeX = 25;
    private final int spriteSizeY = 25;
    static final int fieldLoc = 10;
    static final int fieldX = 875;
    static final int fieldY = 475;
    private int playerLocX;
    private int playerLocY;
    private int compLocX;
    private int compLocY;

    // make the frame
    public TagView(final boolean debug, final int windowWidth, final int windowHeight) {
        this.debug = debug;//sets debug instance variable to the value passed into it by TagController
        final JFrame window = new JFrame();
        window.setSize(new Dimension(windowWidth, windowHeight));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setBackground(Color.WHITE);
        window.requestFocus();
        window.setLayout(null);
        window.setResizable(false);
        
        //add all the event listeners
        window.addKeyListener(this);
        this.setSize(new Dimension(windowWidth, windowHeight - 100));
        this.setBackground(Color.WHITE);
        window.getContentPane().add(this);
        this.addMouseMotionListener(this);

        // make the start button
        final JButton start = new JButton("Start");
        final Rectangle rstart = new Rectangle(windowWidth / 4 * 1, windowHeight - 90, 80, 40);
        start.setBounds(rstart);
        start.addActionListener(this);
        window.getContentPane().add(start);
        start.setFocusable(false);

        // make the stop button
        final JButton stop = new JButton("Stop");
        final Rectangle rstop = new Rectangle((windowWidth / 4) * 2, windowHeight - 90, 80, 40);
        stop.setBounds(rstop);
        stop.addActionListener(this);
        window.getContentPane().add(stop);
        stop.setFocusable(false);

        // make the reset button
        final JButton reset = new JButton("Reset");
        final Rectangle rreset = new Rectangle((windowWidth / 4) * 3, windowHeight - 90, 80, 40);
        reset.setBounds(rreset);
        reset.addActionListener(this);
        window.getContentPane().add(reset);
        reset.setFocusable(false);
    }

    protected void paintComponent(final Graphics g) {// repaints the screen 
        super.paintComponent(g);
        g.clearRect(0, 0, this.getWidth(), this.getHeight());// just clears the screen
        g.setColor(Color.BLACK);//draws field of play
        g.fillRect(fieldLoc, fieldLoc, fieldX, fieldY);
        g.setColor(Color.RED);
        g.drawOval(playerLocX, playerLocY, spriteSizeX, spriteSizeY);
        g.setColor(Color.GREEN);
        g.drawOval(compLocX, compLocY, spriteSizeX, spriteSizeY);
    }

    public void drawPlayer(Player p, Computer c) {
        playerLocX = p.playerLocX;
        playerLocY = p.playerLocY;
        compLocX = c.compLocX;
        compLocY = c.compLocY;
    }

    public int getpX() {
        return lastX;
    }

    public int getpY() {
        return lastY;
    }

    @Override
    public void mouseDragged(final MouseEvent e) {// called when the mouse position changes while click is held
        
    }

    @Override
    public void mouseMoved(final MouseEvent e) {// called when the mouse position changes without clicking
        lastX = e.getX();
        lastY = e.getY(); 
        //System.out.println(lastX + " " + lastY);
    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {//called when a key is pressed
        lastKey = e.getKeyCode();
    }

    @Override
    public void keyReleased(final KeyEvent e) {//take a guess
        lastKey = 0 ;

    }

    @Override
    public void actionPerformed(final ActionEvent e) {//gets called when an onscreen button is clicked

    }

}
