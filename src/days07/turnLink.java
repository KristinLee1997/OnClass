package days07;

/**
 * Created by Administrator on 2017/4/14.
 */

public class turnLink {
    public static void main(String[] args) {
        Round ron = new Round();
        for (int i = 0; i < 17; i++) {
            ron.append(i);//��ֵ
        }
        System.out.println(ron.ju().data);//���㣬�����
    }
}

class Node {//���
    int data;
    Node next;

    Node(int data) {//��ʼ�����
        this.data = data;
    }

    void show() {//��ӡ���ֵ
        System.out.print(this.data + "\t");
    }
}

class Round//��
{
    Node index;

    Round()//��ʼ��ͷָ��
    {
        index = new Node(0);
        index.next = null;
    }

    public void appendFirst(int x)//��һ���ڵ����ʱ�����⴦��
    {
        Node a = new Node(x);
        index.next = a;
        a.next = index.next;
        index.data++;
    }

    public void append(int x)//��ĩβ���
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

    public Node ju()//�ҳ����һ����
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

    public Node getTail()//��ȡ���һ���ڵ�
    {
        Node a = index.next;
        while (a.next != index.next) a = a.next;
        return a;
    }

    public void show()//����
    {
        Node a = index.next;
        do {
            a.show();
            a = a.next;
        } while (a != index.next);
    }
}
