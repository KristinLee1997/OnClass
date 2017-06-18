package days20.Factory.SingleFactory;

/**
 * Created by Administrator on 2017/6/4.
 */
public class Factory {
    public BM make(int type){
        switch(type){
            case 230:return new BM230();
            case 523:return new BM523();
            default:break;
        }
        return null;
    }
}
