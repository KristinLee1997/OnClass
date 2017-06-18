package days18;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/6/1.
 * -----------使用Timer和TimerTask-------------
 */
public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Test t = new Test(timer, 10);
        timer.schedule(t, 1000, 1000);
    }
}

class Test extends TimerTask {
    private int imgCount;
    private Timer timer;
    private int curCount = 0;

    public Test(Timer timer, int imgCount) {
        this.timer = timer;
        this.imgCount = imgCount;
    }

    @Override
    public void run() {
        if (++curCount <= imgCount) {
            System.out.println("加载到第" + curCount + "张");
        } else {
            timer.cancel();
            System.out.println("加载完毕");
        }
    }
}