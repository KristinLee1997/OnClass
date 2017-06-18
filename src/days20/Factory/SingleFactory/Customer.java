package days20.Factory.SingleFactory;

/**
 * Created by Administrator on 2017/6/4.
 */
public class Customer {
    public static void main(String[] args) {
        Factory f=new Factory();
        f.make(230).createBM();
      f.make(523).createBM();
    }
}
