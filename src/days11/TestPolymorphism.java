package days11;

/**
 * Created by Administrator on 2017/5/5.
 * ��ϰ��̬�ԣ�д���������ҵ���ʳ�������Ҫ����д������,�й������ӣ� �ձ�����˾;  �������ݲ�
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        TestPolymorphism t = new TestPolymorphism();
        Country c1 = new China("China", "dumpling");
        t.people(c1);
        Country c2 = new Japan("Japan", "sushi");
        t.people(c2);
        Country c3 = new Korea("Korea", "pickle");
        t.people(c3);
    }

    public static void people(Country c) {
        System.out.println("����" + c.getName());
        c.getfood();
    }

}


class Country {
    private String food;
    private String name;

    public Country(String food) {
        this.food = food;
    }

    public void getfood() {
        System.out.println("This is " + food);
    }

    public String getName() {
        return this.name;
    }
}

class China extends Country {
    private String food;
    private String name;

    public China(String name, String food) {
        super(food);
        this.name = name;
        this.food = food;
    }

    public void getfood() {
        System.out.println("The food of China is " + food);
    }

    public String getName() {
        return this.name;
    }
}


class Japan extends Country {
    private String food;
    private String name;

    public Japan(String name, String food) {
        super(food);
        this.name = name;
        this.food = food;
    }

    public void getfood() {
        System.out.println("The food of Japan is " + food);
    }

    public String getName() {
        return this.name;
    }
}

class Korea extends Country {
    private String food;
    private String name;

    public Korea(String name, String food) {
        super(food);
        this.name = name;
        this.food = food;
    }

    public void getfood() {
        System.out.println("The food of Korea is " + food);
    }

    public String getName() {
        return this.name;
    }
}