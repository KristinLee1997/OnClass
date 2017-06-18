package days11;

/**
 * Created by Administrator on 2017/4/28.
 */
public class A {
    public static void main(String[] args) {
        C c = new B();
        ((B)c).show();

    }
}

class B extends C {

    public void show() {
        System.out.println("!!!");
    }

    public void go() {
        System.out.println("abcdef");
    }
}

class C {
    public void go() {
        System.out.println("abc");
    }
}
