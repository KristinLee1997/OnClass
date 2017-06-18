package days17;

import java.util.*;

/**
 * Created by Administrator on 2017/5/24.0
 * ------------HashMap遍历及排序------------
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Lucy", 19);
        map.put("Dick", 20);
        map.put("Alice", 18);
        map.put("Joan", 21);
        System.out.println("第一种遍历：---根据键得到值");
        Set<String> set = map.keySet();
        Iterator<String> it1 = set.iterator();
        while (it1.hasNext()) {
            System.out.print(map.get(it1.next()) + " ");
        }
        System.out.println();

        System.out.println("第二种遍历：---直接得到值");
        Collection<Integer> c = map.values();
        Iterator<Integer> it2 = c.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.println();

        System.out.println("第三种遍历：---直接得到键和值");
        Set<Map.Entry<String, Integer>> set2 = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it3 = set2.iterator();
        while (it3.hasNext()) {
            Map.Entry<String, Integer> m = it3.next();
            System.out.print(m.getKey() + ": " + m.getValue());
        }
        System.out.println();

        System.out.println("第四种遍历：----foreach，根据键得到值");
        for (String key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
        System.out.println();

        System.out.println("第五种遍历：----foreach直接得到值");
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("正序输出：");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for (Map.Entry<String, Integer> i : list) {
            System.out.println(i + " ");
        }

        System.out.println("倒序输出：");
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -(o1.getValue()-o2.getValue());
            }
        });

        for(Map.Entry<String,Integer> i:list){
            System.out.println(i+" ");
        }
    }
}
