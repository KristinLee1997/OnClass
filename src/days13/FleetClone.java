package days13;

/**
 * Created by Administrator on 2017/5/12.
 * ----Ç³¿ËÂ¡----
 */
public class FleetClone {
    public static void main(String[] args) {
        Bird b = new Bird("L1", 18);
        Sheep s1 = new Sheep("L2", 19, b);
        Sheep s2 = (Sheep) s1.clone();
        s2.b.name = "haha";
        s2.b.age = 90;
        System.out.println("name=" + s1.b.name + "," + "age=" + s1.b.age);
        System.out.println("name=" + s2.b.name + "," + "age=" + s2.b.age);
    }
}

class Bird {
    String name;
    int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Sheep implements Cloneable {
    Bird b;
    String name;
    int age;

    public Sheep(String name, int age, Bird b) {
        this.name = name;
        this.age = age;
        this.b = b;
    }

    public Object clone() {
        Sheep i = null;
        try {
            i = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return i;
    }
}