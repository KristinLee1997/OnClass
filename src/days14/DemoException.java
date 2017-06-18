package days14;

/**
 * Created by Administrator on 2017/5/14.
 * ------自定义异常--------
 */
public class DemoException {
    public static void main(String[] args) {
        Person p1 = new Person("L1", 10);
        Person p2 = new Person("L2", 15);
        Person p3 = new Person("L3", 150);
        Person p4 = new Person("L4", 50);
        p1.show();
        p2.show();
        p3.show();
        p4.show();
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        if (this.age < 0 || this.age >= 150) {
            throw new NoAgeException("年龄不合法");
        } else {
            System.out.println("the age of " + this.name + " is " + this.age);
        }
    }
}

class NoAgeException extends RuntimeException {
    String str;

    NoAgeException(String str) {
        this.str = str;
    }
}