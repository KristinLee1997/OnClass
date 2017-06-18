package days21.interaction;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/18.
 */
public class SocServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(4444);
        Socket socket = server.accept();
        BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        boolean flag = true;
        while (flag) {
            String msg = bf.readLine();
            if (msg.toLowerCase().equals("exit")) {
                flag = false;
                System.out.println("over");
            }
            System.out.printf("%s\n", msg);
        }
        bf.close();
        socket.close();
        server.close();
    }
}
