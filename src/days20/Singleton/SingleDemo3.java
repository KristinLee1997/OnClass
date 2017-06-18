package days20.Singleton;

/**
 * Created by Administrator on 2017/6/4.
 * ------------����ģʽ֮�ڲ���---------------
 */
public class SingleDemo3 {
    private SingleDemo3() {

    }

    private static class Inner {
        private static final SingleDemo3 sin = new SingleDemo3();
    }

    public static SingleDemo3 getInstance() {
        return Inner.sin;
    }

}
