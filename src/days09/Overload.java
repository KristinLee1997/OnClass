package days09;

/**
 * Created by Administrator on 2017/4/22.
 * -----65个构造器----
 */
public class Overload {   //n个构造器
    int age;
    float height;
    char c;
    String str;

    //zero--1个
    public Overload() {

    }

    //one--4个
    public Overload(int age) {
        this.age = age;
    }

    public Overload(float height) {
        this.height = height;
    }

    public Overload(char c) {
        this.c = c;
    }

    public Overload(String str) {
        this.str = str;
    }

    //two--12个
    public Overload(int age, float height) {
        this(age);
        this.height = height;
    }

    public Overload(float height, int age) {
        this(height);
        this.age = age;
    }

    public Overload(int age, char c) {
        this(age);
        this.c = c;
    }

    public Overload(char c, int age) {
        this(c);
        this.age = age;
    }

    public Overload(int age, String str) {
        this(age);
        this.str = str;
    }

    public Overload(String str, int age) {
        this(str);
        this.age = age;
    }

    public Overload(float height, char c) {
        this(height);
        this.c = c;
    }

    public Overload(char c, float height) {
        this(c);
        this.height = height;
    }

    public Overload(float height, String str) {
        this(height);
        this.str = str;
    }

    public Overload(String str, float height) {
        this(str);
        this.height = height;
    }

    public Overload(char c, String str) {
        this(c);
        this.str = str;
    }

    public Overload(String str, char c) {
        this(str);
        this.c = c;
    }

    //three--24个
    public Overload(int age, float height, char c) {
        this(age, height);
        this.c = c;
    }

    public Overload(int age, char c, float height) {
        this(age, c);
        this.height = height;
    }

    public Overload(float height, int age, char c) {
        this(height, age);
        this.c = c;
    }

    public Overload(char c, int age, float height) {
        this(c, age);
        this.height = height;
    }

    public Overload(float height, char c, int age) {
        this(height, c);
        this.age = age;
    }

    public Overload(char c, float height, int age) {
        this(c, height);
        this.age = age;
    }

    public Overload(int age, float height, String str) {
        this(age, height);
        this.str = str;
    }

    public Overload(int age, String str, float height) {
        this(age, str);
        this.height = height;
    }

    public Overload(float height, int age, String str) {
        this(height, age);
        this.str = str;
    }

    public Overload(String str, int age, float height) {
        this(str, age);
        this.height = height;
    }

    public Overload(float height, String str, int age) {
        this(height, str);
        this.age = age;
    }

    public Overload(String str, float height, int age) {
        this(str, height);
        this.age = age;
    }


    public Overload(int age, char c, String str) {
        this(age, c);
        this.str = str;
    }


    public Overload(int age, String str, char c) {
        this(age, str);
        this.c = c;
    }


    public Overload(char c, int age, String str) {
        this(c, age);
        this.str = str;
    }

    public Overload(String str, int age, char c) {
        this(str, age);
        this.c = c;
    }

    public Overload(char c, String str, int age) {
        this(c, str);
        this.age = age;
    }

    public Overload(String str, char c, int age) {
        this(str, c);
        this.age = age;
    }

    public Overload(char c, float height, String str) {
        this(c, height);
        this.str = str;
    }

    public Overload(char c, String str, float height) {
        this(c, str);
        this.height = height;
    }

    public Overload(float height, char c, String str) {
        this(height, c);
        this.str = str;
    }

    public Overload(String str, char c, float height) {
        this(str, c);
        this.height = height;
    }

    public Overload(float height, String str, char c) {
        this(height, str);
        this.c = c;
    }

    public Overload(String str, float height, char c) {
        this(str, height);
        this.c = c;
    }

    //four--24个
    public Overload(int age, char c, float height, String str) {
        this.age = age;
        this.c = c;
        this.height = height;
        this.str = str;
    }

    public Overload(int age, char c, String str, float height) {
        this(age, c, height, str);
    }

    public Overload(int age, float height, char c, String str) {
        this(age, c, height, str);
    }

    public Overload(int age, String str, char c, float height) {
        this(age, c, height, str);
    }

    public Overload(int age, float height, String str, char c) {
        this(age, c, height, str);
    }

    public Overload(int age, String str, float height, char c) {
        this(age, c, height, str);
    }

    public Overload(char c, int age, float height, String str) {
        this(age, c, height, str);
    }

    public Overload(char c, int age, String str, float height) {
        this(age, c, height, str);
    }

    public Overload(char c, float height, int age, String str) {
        this(age, c, height, str);

    }

    public Overload(char c, String str, int age, float height) {
        this(age, c, height, str);
    }

    public Overload(char c, float height, String str, int age) {
        this(age, c, height, str);
    }

    public Overload(char c, String str, float height, int age) {
        this(age, c, height, str);
    }

    public Overload(float height, int age, char c, String str) {
        this(age, c, height, str);
    }

    public Overload(float height, int age, String str, char c) {
        this(age, c, height, str);
    }

    public Overload(float height, char c, int age, String str) {
        this(age, c, height, str);
    }

    public Overload(float height, String str, int age, char c) {
        this(age, c, height, str);
    }

    public Overload(float height, char c, String str, int age) {
        this(age, c, height, str);
    }

    public Overload(float height, String str, char c, int age) {
        this(age, c, height, str);
    }

    public Overload(String str, int age, char c, float height) {
        this(age, c, height, str);
    }

    public Overload(String str, int age, float height, char c) {
        this(age, c, height, str);
    }

    public Overload(String str, char c, int age, float height) {
        this(age, c, height, str);
    }

    public Overload(String str, float height, int age, char c) {
        this(age, c, height, str);
    }

    public Overload(String str, char c, float height, int age) {
        this(age, c, height, str);
    }

    public Overload(String str, float height, char c, int age) {
        this(age, c, height, str);
    }

    public static void main(String[] args) {
        Overload L = new Overload(12);
        System.out.println(L.age);
    }
}

