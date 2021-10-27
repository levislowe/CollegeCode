

public class ComPlayer extends Player{

    private int xLocation = getX();
    private int yLocation = getY();
    private double ranInt = 0;
    private int counter = 0;
    private double angle;
    public ComPlayer(int id, int initialX, int initialY, boolean initialIt) {
        super(id, initialX, initialY, initialIt);
        
    }

    public void Chase(int playerX, int playerY){ //chases the player
        xLocation = getX();
        yLocation = getY();

        double yDifference = playerY - yLocation;
        double xDifference = playerX - xLocation;
        
        double angle = Math.atan(yDifference/xDifference);

        if(playerX < xLocation){
            xLocation = (int) (10 * Math.cos(angle + Math.PI)) + xLocation;
            yLocation = (int) (10 * Math.sin(angle + Math.PI)) + yLocation;
            setX(xLocation);
            setY(yLocation);
        }
        else{
            xLocation = (int) (10 * Math.cos(angle)) + xLocation;
            yLocation = (int) (10 * Math.sin(angle)) + yLocation;
            setX(xLocation);
            setY(yLocation);
        }
    }
    public void Run(int playerX, int playerY){ //Runs away from the player
        xLocation = getX();
        yLocation = getY();
        double yDifference = playerY - yLocation;
        double xDifference = playerX - xLocation;
        
        angle = Math.atan(yDifference/xDifference);

        counter = 0; 
        checkStuck();
        if(counter == 0){ //runs if not stuck
            if(playerX < xLocation){
                xLocation = (int) (10 * Math.cos(angle)) + xLocation;
                yLocation = (int) (10 * Math.sin(angle)) + yLocation;
                setX(xLocation);
                setY(yLocation);
            }
            else{
                xLocation = (int) (10 * Math.cos(angle + Math.PI)) + xLocation;
                yLocation = (int) (10 * Math.sin(angle + Math.PI)) + yLocation;
                setX(xLocation);
                setY(yLocation);
            }
        }
        
    }
    public void checkStuck(){// check if computer is stuck in corner and moves a random direction 
        int distToCorner1 = (int) Math.sqrt(xLocation^2 + yLocation^2); 
        int distToCorner2 = (int) Math.sqrt((900 - xLocation)^2 + yLocation^2); 
        int distToCorner3 = (int) Math.sqrt(xLocation^2 + (600 - yLocation)^2); 
        int distToCorner4 = (int) Math.sqrt((900 - xLocation) ^2 + (600 - yLocation)^2); 
        
        if(distToCorner1 <= 5 || distToCorner2 <= 5 || distToCorner3 <= 5 || distToCorner4 <= 5 ){
            ranInt  = (Math.floor(Math.random() * 8)) / 4; 
            angle = Math.PI * ranInt;
            xLocation = (int) (10 * Math.cos(angle)) + xLocation;
            yLocation = (int) (10 * Math.sin(angle)) + yLocation;
            setX(xLocation);
            setY(yLocation);
            counter = 1;
        }
    }
    
}
