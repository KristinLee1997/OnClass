package days07;

/**
 * Created by Administrator on 2017/4/14.
 */

public class turnLink {
    public static void main(String[] args) {
        Round ron = new Round();
        for (int i = 0; i < 17; i++) {
            ron.append(i);//赋值
        }
        System.out.println(ron.ju().data);//计算，并输出
    }
}

class Node {//结点
    int data;
    Node next;

    Node(int data) {//初始化结点
        this.data = data;
    }

    void show() {//打印结点值
        System.out.print(this.data + "\t");
    }
}

class Round//环
{
    Node index;

    Round()//初始化头指针
    {
        index = new Node(0);
        index.next = null;
    }

    public void appendFirst(int x)//第一个节点添加时，特殊处理
    {
        Node a = new Node(x);
        index.next = a;
        a.next = index.next;
        index.data++;
    }

    public void append(int x)//在末尾添加
    {

        if (index.next == null) appendFirst(x);
        else {
            Node a = new Node(x);
            Node n = getTail();
            n.next = a;
            a.next = index.next;
            index.data++;
        }
    }

    public Node ju()//找出最后一个人
    {
        int counter = 1;
        Node scan = index;
        while (index.data > 1) {

            if (counter % 3 == 0) {
                scan.next = scan.next.next;
                index.data--;
            } else {
                scan = scan.next;
            }
            counter++;

        }
        index.next = scan;
        return scan;
    }

    public Node getTail()//获取最后一个节点
    {
        Node a = index.next;
        while (a.next != index.next) a = a.next;
        return a;
    }

    public void show()//遍历
    {
        Node a = index.next;
        do {
            a.show();
            a = a.next;
        } while (a != index.next);
    }
}
