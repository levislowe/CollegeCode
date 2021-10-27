import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class TagController extends TimerTask {

    private boolean debug = true;// prints debug info when true
    private TagView view;
    private Timer timer;
    private boolean running = false;
    private final int timerMS = 10;
    private final int frameWidth = 900;
    private final int frameHeight = 600;
    static boolean playerIt = false;
    static boolean computerIt = false;
    private Player human;
    private Computer cpu;
    private Vector<Player> netPlayers = new Vector<Player>();
    //private Vector<Computer> netComputers = new Vector<Computer>();

    public static void main(String[] args) {// constructs an instance of TagController
        TagController theGame = new TagController();
    }

    public TagController() {
        timer = new Timer();
        human = new Player();
        cpu = new Computer();
        view = new TagView(debug, frameWidth, frameHeight);
        timer.schedule(this, 0, timerMS);
        startTimer();
        itGenerator();
        NetClient network = new NetClient(netPlayers, human, /*netComputers, cpu,*/ 1000);
        Thread netWorker = new Thread(network);
        netWorker.start();
    }

    public void itGenerator() {
        Random rand = new Random();
        int it = rand.nextInt(2);
        //System.out.println("It Value = " + it);
        if (it == 0) {
            playerIt = true;
            computerIt = false;
            //System.out.println("Player is it");
        } else {
            playerIt = false;
            computerIt = true;
            //System.out.println("Computer is it");

        }
    }

    public void startTimer() {// begin the timer
        running = true;
    }

    public void stopTimer() {// end the timer
        running = false;

    }

    public void run() {// called every tick
        if (running) {
            human.updatePlayer(view.getpX(), view.getpY());
            cpu.updateComputer(human);
            view.drawPlayer(human);
            //view.drawComputer(cpu);
            view.repaint();

        }
    }
}
