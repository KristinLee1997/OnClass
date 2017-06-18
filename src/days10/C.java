package days10;

/**
 * Created by Administrator on 2017/4/23.
 */

public class C extends days10.Test.A {
    String name;

    C(String name) {
        super(name);
        this.name=name;
    }

    protected void showName() {
        System.out.println("the name of c is " + name);
    }

    public static void main(String[] args) {
        C c=new C("C");
        System.out.println("不同包中protected");
        c.showName();
    }
}
