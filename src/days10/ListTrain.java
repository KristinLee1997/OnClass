package days10;
/**
 * Created by Administrator on 2017/4/25.
 */
public class ListTrain {
    public static void main(String[] args) {
        List1 l = new List1();
        l.append(1);
        l.append(3);
        l.append(5);
        l.append(7);
        l.display();
    }
}

class Node1 {
    int data;
    Node next;

    Node1() {
        this.data = data;
    }

    public void showNode() {
        System.out.printf("%d ", this.data);
    }
}

class List1 {
    Node head;

    List1() {
        head = new Node(0);
        head.next = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        newNode.next = null;
    }

    public void display() {
        Node p = head.next;
        while (p != null) {
            p.showNode();
            p = p.next;
        }
        System.out.println();
    }
}