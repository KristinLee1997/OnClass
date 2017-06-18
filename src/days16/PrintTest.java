package days16;


import java.util.*;

/**
 * Created by Administrator on 2017/5/20.
 * ----------���������ֱ�����ʽ------------------
 * -------���б�����ѡ��ArrayList,Vector--------
 * -------��������ɾ��ѡ��LinkedList-------------
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

        System.out.println("��һ�ֱ�����");
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        System.out.println("�ڶ��ֱ�����");
        ListIterator<Integer> lit=list.listIterator();
        while(lit.hasNext()){
            System.out.print(lit.next()+" ");
        }
        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        System.out.println();

        System.out.println("�����ֱ�����");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        System.out.println("�����ֱ�����");
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("�����ֱ�����");
        Object[] o=list.toArray();
        for(Object i:o){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("�����ֱ�����");
        Enumeration<Integer> en = list.elements();
        while(en.hasMoreElements()){
            System.out.print(en.nextElement()+" ");
        }
        System.out.println();
    }
}
