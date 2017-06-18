package days09;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Juhe {
    V v;
    public void set(V v){
        this.v=v;
    }
    public void go(){
        v.a();
    }

    public static void main(String[] args) {
        Juhe j=new Juhe();
        V v=new V();
        j.set(v);
        j.go();
    }
}

class V{
    public void a(){
        System.out.println("sdgfgfg");
    }
}

