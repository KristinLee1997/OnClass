package days09;

/**
 * Created by Administrator on 2017/4/28.
 */
public class Aggregation_People {//¾ÛºÏAggregation
    Radio d;

    public void set(Radio d) {
        this.d = d;
    }

    public void go() {
        d.show();
    }

    public static void main(String[] args) {
        Radio d = new Radio();
        Aggregation_People A = new Aggregation_People();
        A.set(d);
        A.go();
    }
}

class Radio {
    public void show() {
        System.out.println("I am a radio");
    }
}
