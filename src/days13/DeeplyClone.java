package days13;

/**
 * Created by Administrator on 2017/5/12.
 * ----Éî¿ËÂ¡----
 */
public class DeeplyClone {
    public static void main(String[] args) {
        Bird b = new Bird("L1", 18);
        Sheep s1 = new Sheep("L2", 19, b);
        Sheep s2 = (Sheep) s1.clone();
        s2.b.name = "hahahaha";
        //s2.b.age = 90;
        System.out.println("name=" + s1.b.name + "\tage=" + s1.b.age);
        System.out.println("name=" + s2.b.name + "\tage=" + s2.b.age);
    }
}

class Bird2 implements Cloneable {
    String name;
    int age;

    public Bird2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        Bird2 i = null;
        try {
            i = (Bird2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return i;
    }
}

class Tiger implements Cloneable {
    Bird2 b;
    String name;
    int age;

    public Tiger(String name, int age, Bird2 b) {
        this.name = name;
        this.age = age;
        this.b = b;
    }

    public Object clone() {
        Tiger i = null;
        try {
            i = (Tiger) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        i.b = (Bird2) b.clone();
        return i;
    }
}