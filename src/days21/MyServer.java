package days21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/18.
 * ---------------���ն˳���---------------
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
        ServerSocket server = new ServerSocket(4445);//�������ն˿ں�
        Socket socket = server.accept();                //���շ��Ͷ˷�������Ϣ
        BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));//����Ϣ��������ʽ��ȡ
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

