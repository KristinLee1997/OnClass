package days17;

import java.util.*;

/**
 * Created by Administrator on 2017/5/24.
 * ------------HashTable±È¿˙º∞≈≈–Ú-------------
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Lucy", 19);
        table.put("Dick", 20);
        table.put("Alice", 18);
        table.put("Joan", 21);
        Set<String> set = table.keySet();
        Iterator<String> it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.print(table.get(it1.next()) + " ");
        }
        System.out.println();

        Collection<Integer> c = table.values();
        Iterator<Integer> it2 = c.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.println();

        Set<Map.Entry<String, Integer>> set2 = table.entrySet();
        Iterator<Map.Entry<String, Integer>> it3 = set2.iterator();
        while (it3.hasNext()) {
            Map.Entry<String, Integer> m = it3.next();
            System.out.print(m.getKey() + ":" + m.getValue() + " ");
        }
        System.out.println();

        for (String key : table.keySet()) {
            System.out.print(table.get(key) + " ");
        }
        System.out.println();

        for (Integer value : table.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        Enumeration<Integer> en = table.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println();

        List<Map.Entry<String,Integer>> list=new ArrayList<>(table.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        for(Map.Entry<String,Integer> i:list){
            System.out.println(i+" ");
        }
    }
}
