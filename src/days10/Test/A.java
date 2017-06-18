package days10.Test;

/**
 * Created by Administrator on 2017/4/23.
 */
public class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    protected void showName() {
        System.out.println(name);
    }

    void print() {
        System.out.println("default");
    }
}

