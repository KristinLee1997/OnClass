package days09;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Composite_People { //×éºÏcomposite
    Foot F;

    public Composite_People() {
        F = new Foot();
    }

    public void go() {
        F.show();
    }

    public static void main(String[] args) {
        Composite_People C = new Composite_People();
        C.go();
    }

}

class Foot {
    public void show() {
        System.out.println("I am the head of Foot");
    }
}

