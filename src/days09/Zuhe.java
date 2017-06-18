package days09;

/**
 * Created by Administrator on 2017/4/23.
 * ------Composite--------
 */
public class Zuhe {
    C c;
    Zuhe(){
        c=new C();
    }

    public void go(){
        c.show();
    }

    public static void main(String[] args) {
        Zuhe z=new Zuhe();
        z.go();
    }
}

class C{
    public void show(){
        System.out.println("sdadsas");
    }
}

