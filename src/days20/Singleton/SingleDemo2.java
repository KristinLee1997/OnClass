package days20.Singleton;

/**
 * Created by Administrator on 2017/6/4.
 * -------------����ģʽ֮����ʽ----------------
 */
public class SingleDemo2 {
    private SingleDemo2() {
    }

    private static SingleDemo2 sin = new SingleDemo2();

    public static SingleDemo2 getInstance() {
        return sin;
    }
}
