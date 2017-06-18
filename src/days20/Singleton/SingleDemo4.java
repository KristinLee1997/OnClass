package days20.Singleton;

/**
 * Created by Administrator on 2017/6/4.
 * ------------����ģʽ֮˫����----------------
 */
public class SingleDemo4 {
    private volatile static SingleDemo4 sin = null;  //����дVolatile���Ҳ��

    private SingleDemo4() {

    }

    public static SingleDemo4 getInstance() {
        if (sin == null) {
            synchronized (SingleDemo4.class) {
                if (sin == null) {
                    sin = new SingleDemo4();
                }
            }
        }
        return sin;
    }
}
