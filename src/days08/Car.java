package days08;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Car {
    int v;

    int getV() {
        return v;
    }

    void setV(int v) {
        if (v > 60) {
            this.v = 40;
        } else {
            this.v = v;
        }
    }
}