package test06;

import java.util.*;
import java.util.function.BiConsumer;

public class test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(map.get(s));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> m : entries ) {
            System.out.println(m.getKey() + m.getValue());
        }

        map.forEach((String s1, String s2)-> System.out.println(s1 + s2));
        System.out.println(getSum(1,2,3,4,5,6,7,8,9));

        System.out.println("------------------------------");

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "abc", "bcd", "123", "456");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static int getSum(int...args) {
        int ret = 0;
        for (int i = 0; i < args.length; i++) {
            ret += args[i];
        }
        return ret;
    }
}

