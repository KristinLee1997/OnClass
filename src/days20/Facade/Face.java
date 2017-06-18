package days20.Facade;

/**
 * Created by Administrator on 2017/6/4.
 */
public class Face {
    public void useit() {
        ProductA a = new ProductA();
        a.show();
        ProductB b = new ProductB();
        b.show();
        ProductC c = new ProductC();
        c.show();
    }
}
