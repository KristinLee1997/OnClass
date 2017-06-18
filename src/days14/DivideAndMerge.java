package days14;

import java.io.*;

/**
 * Created by Administrator on 2017/5/18.
 * ------1.��E:\a\Test1��1.txtÿ�����ֽڷָ�Ϊһ���ļ�---------
 * <p>
 * ------2.������ļ��ϲ�Ϊһ���ļ�������E:\a\Test2\1.txt------
 */

public class DivideAndMerge {
    public static void main(String[] args) {
        DivideAndMerge d = new DivideAndMerge();
        d.divide();
        //d.merge();
    }

    /**
     * ��һ���ļ��ָ�Ϊ����ļ�
     */
    public void divide() {
        File file = new File("E:\\a\\Test1\\1.txt");
        try (RandomAccessFile r = new RandomAccessFile(file, "r")) {
            byte[] buffer = new byte[2];
            int n = 0;
            int i = 1;
            while ((n = r.read(buffer)) != -1) {
                RandomAccessFile w = new RandomAccessFile("E:\\a\\Test2\\" + (i++) + ".txt", "rw");
                w.write(buffer, 0, n);
                console();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ��������ʾ��
     */
    public void console() throws IOException {
        System.out.print(">>");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * ������ļ��ϲ�Ϊһ���ļ�r
     */
    public void merge() {
        File file;
        try (RandomAccessFile w = new RandomAccessFile("E:\\a\\Test1\\1.txt", "rw")) {
            int i = 1;
            while ((file = new File("E:\\a\\Test2\\" + (i++) + ".txt")).exists()) {
                RandomAccessFile r = new RandomAccessFile(file, "r");
                copy(r, w);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ���������ļ�copy��
     */
    public void copy(RandomAccessFile r, RandomAccessFile w) throws IOException {
        byte[] buffer = new byte[2];
        int n = 0;
        while ((n = r.read(buffer)) != -1) {
            w.write(buffer, 0, n);
        }
    }
}
