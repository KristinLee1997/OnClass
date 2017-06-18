package days16;

import java.util.*;

/**
 * Created by Administrator on 2017/5/20.
 * -----实现简单的购物车，并计算出购物车内小计和总计---------
 */
public class ShoppingCar {
    public static void main(String[] args) {
        Cal c = new Cal();
        c.cal(c);
    }
}

/**
 * 商品信息
 */
class Goods {
    private String gno;
    private String name;
    private double price;
    private int num;

    public Goods(String gno, String name, double price, int num) {
        this.gno = gno;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getGno() {
        return gno;
    }

    public void setGno(String gno) {
        this.gno = gno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class Cal {
    public static List<Goods> list = new ArrayList<>();

    /**
     * 计算购物车内各类物品总价
     * */
    public void cal(Cal c) {
        Goods g1 = new Goods("ctl0001", "杨梅", 11, 1);
        c.buy(g1);
        Goods g2 = new Goods("ctl0002", "芒果", 12, 2);
        c.buy(g2);
        g1 = new Goods("ctl0001", "杨梅", 11, 2);
        Goods g3=new Goods("ctl0004","苹果",6,2);
        c.buy(g3);
        double total = 0;
        List<Goods> f = c.buy(g1);
        for (Goods i : f) {
            double sum = i.getPrice() * i.getNum();
            System.out.println(i.getName() + ": " + i.getPrice() + "元/盒" + " * " + i.getNum() + "盒" + " = " + sum + "元");
            total += sum;
        }
        System.out.println("总计：" + total + "元");
    }

    /**
     * 将物品添进购物车
     * */
    public List<Goods> buy(Goods newGood) {
        List<Goods> list = Cal.list;
        boolean flag = false;
        for (Goods oldGood : list) {
            if (oldGood.getName() == newGood.getName()) {
                oldGood.setNum(oldGood.getNum() + newGood.getNum());
                flag = true;
            }
        }
        if (!flag) {
            list.add(newGood);
        }
        return list;
    }
}
