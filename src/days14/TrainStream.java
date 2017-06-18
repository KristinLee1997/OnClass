package days14;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * Created by Administrator on 2017/5/13.
 * -----向c://1.txt 写入内容并且读出--------
 */
public class TrainStream {
    public static void main(String[] args) {
        new Steam().write();
        new Steam().read();
    }
}

class Steam {
    public void write() {
        try (OutputStream out = new FileOutputStream("c://1.txt")) {
            out.write("I am Lee".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try (InputStream in = new FileInputStream("c://1.txt")) {
            byte[] buffer = new byte[1024];
            int n = 0;
            while ((n = in.read(buffer)) != -1) {
                System.out.println(new String(buffer));
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}