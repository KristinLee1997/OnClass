package days16;


import java.util.*;

/**
 * Created by Administrator on 2017/5/20.
 * ----------容器的六种遍历方式------------------
 * -------进行遍历多选择ArrayList,Vector--------
 * -------进行增，删多选择LinkedList-------------
 */
public class PrintTest {
    public static void main(String[] args) {
        new PrintTest().test();
    }

    public void test(){
        //List<Integer> list=new ArrayList();
        Vector<Integer> list=new Vector<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("第一种遍历：");
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        System.out.println("第二种遍历：");
        ListIterator<Integer> lit=list.listIterator();
        while(lit.hasNext()){
            System.out.print(lit.next()+" ");
        }
        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        System.out.println();

        System.out.println("第三种遍历：");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        System.out.println("第四种遍历：");
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("第五种遍历：");
        Object[] o=list.toArray();
        for(Object i:o){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("第六种遍历：");
        Enumeration<Integer> en = list.elements();
        while(en.hasMoreElements()){
            System.out.print(en.nextElement()+" ");
        }
        System.out.println();
    }
}
