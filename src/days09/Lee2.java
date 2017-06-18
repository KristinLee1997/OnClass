package days09;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Lee2 {   //Aggregetion
    private Computer C;

    void setComputer(Computer C) {
        this.C = C;
    }

    public void go() {
        C.show();
    }

    public static void main(String[] args) {
        Lee2 L = new Lee2();
        Computer C = new Computer();
        L.setComputer(C);
        L.go();
    }
}

class Computer {
    public void show() {
        System.out.println("I am computer!!!");
    }
}

