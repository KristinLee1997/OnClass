package days18;

/**
 * Created by Administrator on 2017/6/1.
 * -----------¶àÏß³Ì----------------
 */

public class Main {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.setDaemon(true);
        t2.start();


		/*TestRun t=new TestRun();
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		t3.start();
		t4.start();*/
    }
}

class TestThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
//            if(i==50){
//                Thread.currentThread().stop();
//            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class TestThread2 extends Thread{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class TestRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}

