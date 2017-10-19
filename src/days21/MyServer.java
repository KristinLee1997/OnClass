package days21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/18.
 * ---------------接收端程序---------------
 */

public class MyServer {
    public static void main(String[] args) {
        /*try {
            server();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void server() throws IOException {
        System.out.println("Successed!");
        ServerSocket server = new ServerSocket(4445);//建立接收端口号
        Socket socket = server.accept();                //接收发送端发来的消息
        BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));//将消息以流的形式读取
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
        server.close();*/
    }
}

