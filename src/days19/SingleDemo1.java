package days19;

/**
 * Created by Administrator on 2017/6/3.
 * ---------单例模式之懒汉式--------------
 */
public class SingleDemo1 {
    private SingleDemo1 sin=null;
    private SingleDemo1(){

    }

    public SingleDemo1 getInstance(){
        if(sin==null)
            sin=new SingleDemo1();
        return sin;
    }
}


