package days14;

/**
 * Created by Administrator on 2017/5/14.
 * �������������100,r��a���������ֵ���м���������Զ����쳣������������ԣ���д**
 */
public class DemoException2 {
    public static void main(String[] args) {
        Graph C = new Circle();
        System.out.println(C.getR());
        Graph R = new Rectangle();
        System.out.println(R.getR());
        Circle C2 = new Circle();
        System.out.println(C2.getMax(C2));
        Rectangle R2 = new Rectangle();
        System.out.println(R2.getMax(R2));
    }
}

class Graph {
    int r;

    public int getR() {
        return r;
    }

    public double getMax(Graph g) {
        return 0.0;
    }
}

class Circle extends Graph {
    private int r = 1;

    public int getR() {
        return this.r;
    }

    private void setR(int r) {
        if (r < 0) {
            throw new OverAreaException("Բ�İ뾶���Ϸ�������");
        } else {
            this.r = r;
        }
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public int getMax(Circle c) {
        while (c.getArea() < 100) {
            c.r++;
        }
        return c.r-1;
    }
}

class Rectangle extends Graph {
    private int a = 1;

    public int getR() {
        return this.a;
    }

    public double getArea() {
        return a * a;
    }

    private void setR(int a) {
        if (a < 0) {
            throw new OverAreaException("���α߳����Ϸ�������");
        } else {
            this.a = a;
        }
    }

    public int getMax(Rectangle R) {
        while (R.getArea() < 100) {
            R.a++;
        }
        return R.a-1;
    }
}

class OverAreaException extends RuntimeException {
    String str;

    OverAreaException(String str) {
        this.str = str;
    }
}
