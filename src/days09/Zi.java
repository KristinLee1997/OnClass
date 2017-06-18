package days09;

/**
 * Created by Administrator on 2017/4/22.
 * -----super的两个用法-------
 */
class Fu {
    String familyName;
    int age;


    public Fu(int age) {
        this.age = age;
    }

    public Fu(String familyName, int age) {
        this(age);
        this.familyName = familyName;
    }

    public void showAge() {
        System.out.println("The age of father is "+age);
    }
}

public class Zi extends Fu {
    String name ;
    int age;

    public Zi(int age) {
        super("Lee",30);
        this.age=age;
    }

    public void showZiage() {
        System.out.println("Son的年龄为" +age);
    }

    public void showName(){
        System.out.println("The fmailyName of Son is "+super.familyName);
    }
    public void showFuName(){
        System.out.println("The fmailyName of father is "+super.familyName);
    }
    public void showFuAge(){
        super.showAge();
    }
    public static void main(String[] args) {
        Zi z = new Zi(5);
        z.showFuName();
        z.showFuAge();
        z.showName();
        z.showZiage();
    }
}