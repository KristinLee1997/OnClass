package days10.Test;

/**
 * Created by Administrator on 2017/4/23.
 */
public class B extends A {
    A a=new A("A");
    protected String name;

    public B(String name) {
        super(name);
    }

    void print(){
        a.print();
    }

    public static void main(String[] args) {

        B b=new B("b");
        System.out.println("同一包中default");
        b.print();
    }

}

