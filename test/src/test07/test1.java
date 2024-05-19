package test07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "11,1", "131,2", "24,3", "35,4", "2,5");

//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                int i = Integer.parseInt(s);
//                return i;
//            }
//        }).forEach(System.out::println);

//        list.stream().map(Integer::parseInt).forEach(System.out::println);

//        list.stream().filter(s->s.startsWith("1")).filter(s->s.length() == 2 || s.length() == 3).forEach(System.out::println);
        List<string> collect = list.stream().map(new Function<String, string>() {
            @Override
            public string apply(String s) {
                String[] split = s.split(",");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                return new string(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(collect);


        List<string> collect1 = list.stream().map(string::new).collect(Collectors.toList());
        System.out.println(collect1);



    }


}
