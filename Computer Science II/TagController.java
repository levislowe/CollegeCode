import java.util.Timer;
import java.util.TimerTask;

public class TagController extends TimerTask {

    private int humanScore = 0;
    private int compScore = 0;
    private HumanPlayer p1;

    public static void main(String[] args) {
        TagController theGame = new TagController();
    }

    public TagController() {
        Timer timer = new Timer();
        p1 = newHumanPlayer();
        timer.schedule(this, 2000, 5000);
    }

    public void run() {
        //get event for frame
        //pass event to human player
        //do move for computer player
        //check rules
        //update view
        System.out.println("Timer ran ");
    }
}