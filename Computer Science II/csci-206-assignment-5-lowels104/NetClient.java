import java.util.*;
import java.io.*;
import java.net.*;

public class NetClient implements Runnable {

    //private TagView view;
    private int sleepTime = 0;
    private Vector<Player> netPlayers;
    //private Vector<Computer> netComputers;
    private int playerId;
    //private int computerId;
    private Player human;
    //private Computer computer;

    public NetClient(Vector<Player> netPlayers, Player human, /*Vector<Computer> netComputers, Computer cpu,*/ int updateSpeed) {
        this.sleepTime = sleepTime;
        this.netPlayers = netPlayers;
        this.human = human;
        //this.netComputers = netComputers;
        playerId = (int)(Math.random() * 10000);
        //computerId = (int)(Math.random() * 10000);
        netPlayers.add(human);
        //computer = new Computer();
    }

    public void run() {
        try {
            join(human);
            while (true) {

                /*String moveplayercmd = "move:" + playerId + ":" + 100 + ":" + 100;
                sendReceive(moveplayercmd);*/

                /*String movecomputercmd = "move:" + computerId + ":" + computer.getcX() + ":" + computer.getcY();
                sendReceive(movecomputercmd);*/

                //updateNetPlayers();

                int num = getNetPlayerCount();
                //System.out.println(num);

                for (int count = 0; count < num; count++) {
                    int id = getIdAtIndex(count);
                    Player p = requestId(id);
                    System.out.println(p);
                }
                Thread.sleep(sleepTime);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int getNetPlayerCount() {
        int ret = 0;

        String cmd = "idcount";
        String result = sendReceive(cmd);
        try {
            StringTokenizer st = new StringTokenizer(result, ":");
            if (st.countTokens() == 2) {
                String ack = st.nextToken();
                ret = Integer.valueOf(st.nextToken());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return ret;
    }

    public int getIdAtIndex(int index) {
        int ret = 0;

        String cmd = "index:" + index;
        String result = sendReceive(cmd);
        try {
            StringTokenizer st = new StringTokenizer(result, ":");
            if (st.countTokens() == 2) {
                String ack = st.nextToken();
                ret = Integer.valueOf(st.nextToken());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return ret;
    }

    public Player requestId(int id) {
        Player ret = null;

        String cmd = "request:" + id;
        String result = sendReceive(cmd);
        try {
            StringTokenizer st = new StringTokenizer(result, ":");
            if (st.countTokens() == 5) {
                String ack = st.nextToken();
                int remoteid = Integer.valueOf(st.nextToken());
                int x = Integer.valueOf(st.nextToken());
                int y = Integer.valueOf(st.nextToken());
                boolean it = Boolean.valueOf(st.nextToken());
                ret = new Player();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return ret;
    }

    public void updateNetPlayers() {

        move(100, 100);
        System.out.println(requestId(playerId));

    }

    public boolean join(Player p) {
        boolean ret = false;
        String cmd = "join" + playerId + ":" + 100 + ":" + 100;
        if(sendReceive(cmd).equals("ok")) {
            ret = true;
        }
        else {
            ret = false;
        }
        return ret;
    }

    public boolean move(int x, int y) {
        boolean ret = false;
        String cmd = "move:" + playerId + ":" + x + ":" + y;
        if (sendReceive(cmd).equals("ok")) {
            ret = true;
        }
        return ret;
    }

    public String sendReceive(String send) {
        String ret = "notok";
        try {
            Socket s = new Socket("67.135.220.132", 80);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            out.write(send + "\n");
            out.flush();
            String received = in.readLine();
            System.out.println("Server:" + received);
            ret = received;
            s.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return ret;
    }
}