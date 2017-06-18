package days19;

/**
 * Created by Administrator on 2017/6/3.
 * ------------单例模式之双重锁---------------
 */
public class SingleDemo4 {
    private volatile static SingleDemo4 sin = null;

    private SingleDemo4() {
    }

    public static SingleDemo4 getInstance() {
        if(sin==null){
            synchronized (SingleDemo4.class){
                if(sin==null){
                    sin=new SingleDemo4();
                }
            }
        }
        return sin;
    }
}
