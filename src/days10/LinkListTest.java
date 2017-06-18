package days10;

/**
 * Created by Administrator on 2017/4/25.
 */
class Node {
    int data;
    Node next;

    Node(int data) {//带形参的构造方法，实例化的时候方便赋值
        this.data = data;
    }

    void showNode() {  //为结点结构体创建一个show方法，用来打印结点自己的data值
        System.out.println(data);
    }
}

class List {  //带头节点的链表
    Node head;//头结点

    List() {
        head = new Node(0);//头结点的值赋值为0，（其实没啥用）
        head.next = null;//因为初始化的时候还是空链表，所以将头结点指向空。
    }

    void append(int data) {   //在末尾添加值为data的新结点
        Node newNode = new Node(data);//需要添加值为data的结点，所以先创建一个人值为data的结点
        Node p = head;//利用p进行链表的遍历
        while (p.next != null) {//插入之前先遍历到链表的尾部
            p = p.next;
        }//当循环终止的时候，p指向链表的最后一个结点
        p.next = newNode;//链表尾巴指向新结点(插入)
        newNode.next = null;//将新尾巴指向null
    }

    void showList() {
        Node p = head.next;//head是头结点，不需要打印，有效(需要打印)的第一个结点是head.next
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

