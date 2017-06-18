package days19;

/**
 * Created by Administrator on 2017/6/3.
 * -------------单例模式之饿汉式----------------
 */
public class SingleDemo2 {
    private SingleDemo2() {
    }

    private static SingleDemo2 sin = new SingleDemo2();

    public static SingleDemo2 getInstance() {
        return sin;
    }
}
