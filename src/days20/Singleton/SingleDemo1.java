package days20.Singleton;

/**
 * Created by Administrator on 2017/6/4.
 * ������ģʽ������ģʽ
 * -----------����ģʽ֮����ʽ---------------
 */
public class SingleDemo1 {
    private static SingleDemo1 sin = null;

    private SingleDemo1() {

    }

    public static synchronized SingleDemo1 getInstance() {
        if(sin==null)
            sin=new SingleDemo1();
        return sin;
    }
}