package days09;

/**
 * Created by Administrator on 2017/4/23.
 *
 */
class Car {
    String color;
    int size;

    public Car() {
        color = "red";
        int size = 5;
    }

    public Car(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public void show() {
        System.out.println("the color of Car is " + color);
        System.out.println("the size of Car is " + size);
    }
}

public class Car1 extends Car {
    String makerName;

    Car1(String color, int size, String makerName) {
        super(color, size);
        this.makerName = makerName;
    }

    Car1(int size) {
        this.size = size;
        this.makerName = "±¦Âí";
    }

    Car1() {
        this(100);
    }

    public void show() {
        super.show();
        System.out.println("the makerName of Car is " + makerName);
    }

    public static void main(String[] args) {
        Car c=new Car("grey",120);
        Car1 c1=new Car1(102);
        c.show();
        c1.show();
    }
}


