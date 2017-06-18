package days21;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/18.
 * --------------发送端程序----------------
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            client();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void client() throws IOException {
        Socket socket = new Socket("10.10.41.123", 4444);//声明本机地址及发送端口号
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); //将消息以打印流的形式发送
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            writer.println(scan.nextLine());
        }
        scan.close();
        socket.close();
    }
}
