public class Computer {
    public int compLocX = 800;
    public int compLocY = 400;
    private boolean debug = false;

    public void updateComputer(Player p) {
        //Computer Y Axis Bounds
        if (compLocY == TagView.fieldLoc) { 
            compLocY = compLocY + 5; 
        }
        if (compLocY == TagView.fieldY - 15) {
            compLocY = compLocY - 5;
        }
        //Computer X Axis Bounds
        if (compLocX == TagView.fieldLoc) {
            compLocX = compLocX + 5;
        }
        if (compLocX == TagView.fieldX - 15) {
            compLocX = compLocX - 5;
        }
        if (TagController.computerIt == true) {
            if (p.playerLocY > compLocY) {
                compLocY = compLocY + 1;
                //System.out.println("Computer Location = " + compLocY);
            } else {
                compLocY = compLocY - 1;
                //System.out.println("Computer Location = " + compLocY);
            }
            if (p.playerLocX > compLocX) {
                compLocX = compLocX + 1;
                //System.out.println("Computer Location = " + compLocX);
            } else {
                compLocX = compLocX - 1;
                //System.out.println("Computer Location = " + compLocX);
            }
        } else if (TagController.computerIt == false) {
            if (p.playerLocY > compLocY) {
                compLocY = compLocY - 1;
                //System.out.println("Computer Location = " + compLocY);
            } else {
                compLocY = compLocY + 1;
                //System.out.println("Computer Location = " + compLocY);
            }
            if (p.playerLocX > compLocX) {
                compLocX = compLocX - 1;
                //System.out.println("Computer Location = " + compLocX);
            } else {
                compLocX = compLocX + 1;
                //System.out.println("Computer Location = " + compLocX);
            }
        }
    }
}
