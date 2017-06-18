package days20.Adapter;

/**
 * Created by Administrator on 2017/6/4.
 */
public class Adapter extends Tele implements Socket {
    @Override
    public void addEle() {
        super.useEle();
        System.out.println("add electricity!");
    }
}
