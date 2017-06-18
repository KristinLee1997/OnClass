package days18;
import java.util.*;
/**
 * Created by Administrator on 2017/5/26.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        Set<Integer> set=map.keySet();
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.print(map.get(it.next())+" ");
        }
    }
}
