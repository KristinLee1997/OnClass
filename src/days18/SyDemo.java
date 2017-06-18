package days18;

/**
 * Created by Administrator on 2017/6/2.
 * ------------synchronized----------------
 */
public class SyDemo {
    public static void main(String[] args) {
        Account a = new Account("01", 1000);
        GetMoney g1 = new GetMoney("A", a);
        GetMoney g2 = new GetMoney("B", a);
        g1.start();
        g2.start();
    }
}

class Account {
    private String no;
    private int fund;

    public Account(String no, int fund) {
        this.no = no;
        this.fund = fund;
    }

    public void getMoney(int money, String name) {
        synchronized (this) {
            if (fund >= money) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + "取走了" + money + "元");
                fund -= money;
            } else {
                System.out.println("余额不足");
            }
        }
    }
}

class GetMoney extends Thread {
    private String name;
    private Account account;

    public GetMoney(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void run() {
        account.getMoney(800, name);
    }
}