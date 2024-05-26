package test06;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class auto_click_name {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list, "a1-w-1", "a2-w-3", "a3-w-4", "a4-w-5", "a5-w-6", "a6-w-7", "a7-w-8", "a8-w-9", "a9-w-10");

//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");
//                String ageString = arr[1];
//                int age = Integer.parseInt(ageString);
//                return age;
//            }

        List<String> collect = list.stream().filter(s -> "w".equals(s.split("-")[1])).collect(Collectors.toList());
        Map<String, Integer> collect1 = list.stream()
                .filter(s -> "w".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                return s.split("-")[0];
                            }
                },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                }));
        System.out.println(collect1);
//        }).forEach(s-> System.out.println(s));
//        list.stream().forEach(s-> System.out.println(s));
//        System.out.println(list.stream().count());
//
//        Object[] array = list.stream().toArray();
//        System.out.println(array[1]);
//
//        String[] array1 = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int i) {
//                return new String[i];
//            }
//        });
//        list.stream().toArray(val -> new String[val]);
//        System.out.println(Arrays.toString(array1));

//        System.out.println("1111111111111111111111");
//        Random random = new Random();
//        int idx = random.nextInt(list.size());
//        String name = list.get(idx);
//        System.out.println(name);
//        Collections.shuffle(list);
//        System.out.println(list.get(0));
//        System.out.println("22222222222222222222222");
//        ArrayList<String> list1 = list;
//        System.out.println(list);
//        list.clear();
//        System.out.println(list1);
//        List<String> list = List.of("1", "2", "3");
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        Collections.addAll(list1, "12", "22", "13", "33");
//        for (String name : list1) {
//            if (name.startsWith("1")) {
//                list2.add(name);
//            }
//        }
////        System.out.println(list2);
//        ArrayList<String> list3 = new ArrayList<>();
//        Stream<String> stream = list1.stream();
//
//        stream.forEach(s -> System.out.println(s));

//        HashMap<String, Integer> hash = new HashMap<>();
//
//        hash.put("a",1 );
//        hash.put("b",1 );
//        hash.put("c",1 );
//        hash.put("d",4 );
//        hash.put("e",5 );
//
////        hash.keySet().stream().forEach(s-> System.out.println(s));
////        hash.entrySet().stream().forEach(s-> System.out.println(s));
////        hash.values().stream().forEach(s-> System.out.println(s));
//        hash.keySet().stream().limit(4).skip(1).forEach(s-> System.out.println(s));
//        hash.values().stream().distinct().forEach(s-> System.out.println(s));
    }
}
