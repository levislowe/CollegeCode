/*
 * Levi Savage Lowe
 * 
 * HW Assignment 01
 *
 * CSCI 206
 *
 * Sep 08, 2020
 */

import javax.swing.*;  
import java.awt.event.*;
import java.awt.*;

public class drawDemo extends JPanel implements KeyListener  //classname must match filename exactly
{
    private int plyX = 100; //starting x location for player
    private int plyY = 100; //starting y location for player
    private int objX = 300; //starting x location for object
    private int objY = 300; //starting y location for object
    private final int X = 50; //width of player/object
    private final int Y = 50; //height of player/object
    private String lastKeyPressed = ""; //instance variable
    private String xyValue = ""; //instance variable
    
    public static void main(String[] args) //The method that is called when the java interpreter "Runs" a class file.
    {
        final int screenSize = 500;
        drawDemo theApp = new drawDemo(); //instantiating an object of the DrawDemo class
        JFrame frame = new JFrame(); //make a new frame/window on the screen
        frame.setVisible(true); //a new frame is not visible by default
        frame.setSize(screenSize, screenSize); //sets the frame to a static size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the X box behavior
        frame.add(theApp); //adds theApp instance to the frame
        frame.addKeyListener(theApp); //adds a key listener to receive key events
        frame.requestFocus(); //makes the frame receive the key events
    }

    public drawDemo()
    {
               //constructor this gets called when you instantiate the class (call new)
    }

    @Override //tells the compiler the we are overriding the parent method on purpose
    protected void paintComponent(Graphics g)  //this method gets called whenever the compoennt needs to be updated
    {
        super.paintComponent(g); //take care of all the jobs that the parent does
        g.clearRect(0,0,this.getHeight(), this.getWidth());  //clear the screen before we paint on it
        g.setColor(Color.blue); //color of the player
        g.fillRect(plyX, plyY, X, Y); //where the player starts
        g.setColor(Color.gray);
        g.fillRect(objX, objY, X, Y);
        g.setColor(Color.DARK_GRAY);
        g.drawString(lastKeyPressed, 10, 10);
        g.drawString(xyValue, 10, 25);
    }

    @Override
    public void keyPressed(KeyEvent e) //gets called on a keypress event
    {
        lastKeyPressed = "key code = "+e.getKeyCode();  //this is the keycode from the event
        xyValue = "(x,y) = "+ plyX + "," + plyY; //this is the x and y from the event
        System.out.println(lastKeyPressed); //prints out what key is being pressed
        System.out.println(xyValue); //prints out what the x and y values are for the player
        repaint(); //triggers the call to paintComponent
        if(e.getKeyCode() == KeyEvent.VK_UP) //checks to see if up arrow key is pressed
        {
            if(checkHit(plyX, objX, plyY, objY, 50) == false) //checking the checkHit function
            {
                if(plyY > 0) //checking to see if border is hit
                {
                    plyY = plyY - 5; //player continues to move
                } else
                {
                    plyY = plyY + 10; //player is pushed away from border
                }
            } else
            {
                plyY = plyY + 10; //player is pushed away from object
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN) //checks to see if down arrow key is pressed
        {
            if(checkHit(plyX, objX, plyY, objY, 50) == false) //checking the checkHit function
            {
                if(plyY < 415) //checking to see if border is hit
                {
                    plyY = plyY + 5; //player continues to move
                } else
                {
                    plyY = plyY - 10; //player is pushed away from border
                }
            } else
            {
                plyY = plyY - 10; //player is pushed away from object
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) //checks to see if right arrow key is pressed
        {
            if(checkHit(plyX, objX, plyY, objY, 50) == false) //checking the checkHit function
            {
                if(plyX < 450) //checking to see if border is hit
                {
                    plyX = plyX + 5; //player continues to move
                } else
                {
                    plyX = plyX - 10; //player is pushed away from border
                }
            } else
            {
                plyX = plyX - 10; //player is pushed away from object
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) //checks to see if left arrow key is pressed
        {
            if(checkHit(plyX, objX, plyY, objY, 50) == false) //checking the checkHit function
            {
                if(plyX > 5) //checking to see if border is hit
                {
                    plyX = plyX - 5; //player continues to move
                } else
                {
                    plyX = plyX + 10; //player is pushed away from border
                }
            } else
            {
                plyX = plyX + 10; //player is pushed away from object
            }
        }
        System.out.println(checkHit(plyX, objX, plyY, objY, 50));
    }
    
    public boolean checkHit(int x1, int x2, int y1, int y2, int dist)
    {
        int d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        d = (int)Math.sqrt(d);
        return (d < dist);
    } 

    @Override
    public void keyTyped(KeyEvent e) //all interface methods must exist
    {

    }
    
    @Override
    public void keyReleased(KeyEvent e)  //all interface methods must exist
    {

    }
}