package days16;

import java.util.*;

/**
 * Created by Administrator on 2017/5/20.
 * -----List<?>方便打印多种不同类型的集合------
 *
 */
public class Main {
    public static void main(String[] args) {
//        List<?> listx = new LinkedList<?>(); // Error
        List<?> listy = new LinkedList<Integer>(); // Ok

        List<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<String> list2 = new LinkedList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        List list3 = new LinkedList();
        list3.add(1);
        list3.add("A");
//        list3.add(Hello.class);

        display(list1);
        display(list2);
        display(list3);
    }

    public static void display(List<?> list) {
        // list.add(1); // Error
        System.out.println(list);
    }
}
