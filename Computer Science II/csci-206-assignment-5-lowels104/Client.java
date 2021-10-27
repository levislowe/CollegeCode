import java.io.*;
import java.net.*;
 
public class Client {
    public static void main(String[] args) throws IOException {
         
 
        try {
            
            Socket s = new Socket("67.135.220.132", 80);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            out.write("join:23456:101:101\n");
            out.flush();
            String received = in.readLine();
            if(received.equals("ok")) {
                System.out.println("ok");
            }
            s.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
