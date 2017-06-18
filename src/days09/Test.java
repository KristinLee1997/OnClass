package days09;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Test {
    public static void main(String[] args) {
        Son s = new Son();
        s.a();
    }
}

class Grandpa {
    public Grandpa() {
        System.out.println("Gra");
    }

    public void a() {
        System.out.println("aaa");
    }
}

class Father extends Grandpa {

    public Father() {
        System.out.println("Father");
    }

    public void a() {
        super.a();
    }
}

class Son extends Father {
    public Son() {
        System.out.println("Son");
    }

    public void a() {
        super.a();
    }


}
