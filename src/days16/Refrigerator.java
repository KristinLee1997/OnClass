package days16;

import java.util.*;

/**
 * Created by Administrator on 2017/5/20.
 */
public class Refrigerator {
    public static void main(String[] args) {
        new Refrigerator().go();
    }

    public void go() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("bread");
        list.add("sausage");
        list.add("chips");
        list.add("milk");
        int n = 4;
        while ((n--) > 0) {
//            list.remove(0);
            Iterator<String> it = list.iterator();
            it.next();  //�õ�����ɾ������ӵĺô������Ա����������ݽ��в���ʱ������Ӱ��������ı���
            it.remove();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
            System.out.println();
        }
    }
}
