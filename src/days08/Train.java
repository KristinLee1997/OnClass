package days08;

/**
 * Created by Administrator on 2017/4/16.
 */
public class Train {
    public static void main(String[] args) {
        Driver d=new Driver();
        d.setName("Lee");
        d.setV(61);
        Car c=new Car();
        c.setV(d.getV());
        System.out.println(d.getName());
        System.out.println(c.getV());
    }
}




