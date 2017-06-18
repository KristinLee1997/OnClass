package days19;

/**
 * Created by Administrator on 2017/6/3.
 * ------------单例模式之内部类-------------
 */
public class SingleDemo3 {
    private SingleDemo3() {

    }

    private static class Inner {
        public static final SingleDemo3 SIN = new SingleDemo3();
    }

    public static final SingleDemo3 getInstance() {
        return Inner.SIN;
    }
}
