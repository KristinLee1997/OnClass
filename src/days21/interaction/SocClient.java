package days21.interaction;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/18.
 */
public class SocClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.10.41.130", 4444);
        PrintWriter pw=new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));

    }
}
