package days11;

/**
 * Created by Administrator on 2017/5/4.
 * 根据抽象类，求图像的周长面积，目的：有整体框架
 */
public class TestAbstract2 {
    public static void main(String[] args) {
        Triangle t = new Triangle(2.0, 3.0);
        System.out.println("等边三角形的周长：" + t.getPrimeter());
        System.out.println("等边三角形的面积：：" + t.getArea());
        Circle c = new Circle(5);
        System.out.println("圆的周长：" + c.getPrimeter());
        System.out.println("圆的面积：" + c.getArea());
        Recangle r = new Recangle(4, 5);
        System.out.println("矩形的周长：" + r.getPrimeter());
        System.out.println("矩形的面积：" + r.getArea());
    }
}

abstract class Graph {
    public abstract double getPrimeter();

    public abstract double getArea();
}

class Triangle extends Graph {//等边三角形
    private double width;
    private double height;

    Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPrimeter() {
        return width * 3;
    }

    public double getArea() {
        return width * height / 2;
    }
}

class Circle extends Graph {//圆
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double getPrimeter() {
        return 2 * java.lang.Math.PI * radius;
    }

    public double getArea() {
        return java.lang.Math.PI * radius * radius;
    }
}

class Recangle extends Graph {//矩形
    private int width;
    private int height;

    Recangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getPrimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return height * width;
    }
}