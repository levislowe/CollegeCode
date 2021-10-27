public class Player {
    public int playerLocX = 50;
    public int playerLocY = 50;
    private boolean debug = false;

    public String toString() {
        return "Player" + playerLocX + ":" + playerLocY;
    }

    public void updatePlayer(int x, int y) {
        //Players Y Axis Bounds
        if (playerLocY == TagView.fieldLoc) { 
            playerLocY = playerLocY + 5; 
        }
        if (playerLocY == TagView.fieldY - 15) {
            playerLocY = playerLocY - 5;
        }
        //Players Y Axis Movement
        if (y > playerLocY) {
            playerLocY = playerLocY + 1;
        } else if (y < playerLocY) {
            playerLocY = playerLocY - 1;
        }
        //Players X Axis Bounds
        if (playerLocX == TagView.fieldLoc) {
            playerLocX = playerLocX + 5;
        }
        if (playerLocX == TagView.fieldX - 15) {
            playerLocX = playerLocX - 5;
        }
        //Players X Axis Movement
        if(x > playerLocX) {
            playerLocX = playerLocX + 1;
        } else if(x < playerLocX) {
            playerLocX = playerLocX - 1;
        }
    }
}
