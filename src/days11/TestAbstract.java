package days11;

/**
 * Created by Administrator on 2017/5/4.
 * Á·Ï°abstract,¼ÆËã³µËÙ
 */
public class TestAbstract {
    public static void main(String[] args) {
        Speed s = new Speed();
        s.getRadius();
        s.setTurnrate(40);
        System.out.println(s.getSpeed());
    }
}

abstract class SpeedMeter {
    private int turnrate;

    public SpeedMeter() {

    }

    public abstract double getRadius();

    public void setTurnrate(int turnrate) {
        this.turnrate = turnrate;
    }

    public double getSpeed() {
        return 2 * java.lang.Math.PI * getRadius() * turnrate;
    }
}

class Speed extends SpeedMeter {
    Speed() {

    }

    public double getRadius() {
        return 0.28;
    }
}