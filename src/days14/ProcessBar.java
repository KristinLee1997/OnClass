package days14;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * Created by Administrator on 2017/5/18.
 * ������
 */

public class ProcessBar extends JFrame implements Runnable {
    private JProgressBar progress; // ������

    public ProcessBar(String str) {
        super(str);
        progress = new JProgressBar(1, 100); // ʵ����������
        progress.setStringPainted(true);      // �������
        progress.setBackground(Color.PINK); // ���ñ���ɫ
        this.add(progress);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 300, 250, 50);
        this.setVisible(true);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                progress.setValue(progress.getValue() + 1); // �����߳̽��У����ӽ�����ֵ

                progress.setString(progress.getValue() + "%");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        progress.setVisible(false);
        System.exit(0);
    }

    public static void main(String[] args) {
        ProcessBar pb = new ProcessBar("Test JProcessBar");
        Thread t = new Thread(pb);
        t.start();
    }
}

