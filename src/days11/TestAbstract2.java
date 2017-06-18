package days11;

/**
 * Created by Administrator on 2017/5/4.
 * ���ݳ����࣬��ͼ����ܳ������Ŀ�ģ���������
 */
public class TestAbstract2 {
    public static void main(String[] args) {
        Triangle t = new Triangle(2.0, 3.0);
        System.out.println("�ȱ������ε��ܳ���" + t.getPrimeter());
        System.out.println("�ȱ������ε��������" + t.getArea());
        Circle c = new Circle(5);
        System.out.println("Բ���ܳ���" + c.getPrimeter());
        System.out.println("Բ�������" + c.getArea());
        Recangle r = new Recangle(4, 5);
        System.out.println("���ε��ܳ���" + r.getPrimeter());
        System.out.println("���ε������" + r.getArea());
    }
}

abstract class Graph {
    public abstract double getPrimeter();

    public abstract double getArea();
}

class Triangle extends Graph {//�ȱ�������
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

class Circle extends Graph {//Բ
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

class Recangle extends Graph {//����
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