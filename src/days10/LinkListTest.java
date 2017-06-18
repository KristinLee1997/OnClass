package days10;

/**
 * Created by Administrator on 2017/4/25.
 */
class Node {
    int data;
    Node next;

    Node(int data) {//���βεĹ��췽����ʵ������ʱ�򷽱㸳ֵ
        this.data = data;
    }

    void showNode() {  //Ϊ���ṹ�崴��һ��show������������ӡ����Լ���dataֵ
        System.out.println(data);
    }
}

class List {  //��ͷ�ڵ������
    Node head;//ͷ���

    List() {
        head = new Node(0);//ͷ����ֵ��ֵΪ0������ʵûɶ�ã�
        head.next = null;//��Ϊ��ʼ����ʱ���ǿ��������Խ�ͷ���ָ��ա�
    }

    void append(int data) {   //��ĩβ���ֵΪdata���½��
        Node newNode = new Node(data);//��Ҫ���ֵΪdata�Ľ�㣬�����ȴ���һ����ֵΪdata�Ľ��
        Node p = head;//����p��������ı���
        while (p.next != null) {//����֮ǰ�ȱ����������β��
            p = p.next;
        }//��ѭ����ֹ��ʱ��pָ����������һ�����
        p.next = newNode;//����β��ָ���½��(����)
        newNode.next = null;//����β��ָ��null
    }

    void showList() {
        Node p = head.next;//head��ͷ��㣬����Ҫ��ӡ����Ч(��Ҫ��ӡ)�ĵ�һ�������head.next
        while (p != null) {
            p.showNode();
            p = p.next;
        }
    }
}

public class LinkListTest {
    public static void main(String[] args) {
        List list = new List();
        list.append(4);
        list.append(2);
        list.append(9);
        list.showList();
    }
}

