package JavaCore.Ninth.View;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //这些集合对象不可修改
        //生成包含3个元素的一个列表和一个集
        List<String> names = List.of("Peter", "Paul", "Mary");
        Set<Integer> numbers = Set.of(2, 3, 5);
        //对于映射，需要指定键和值
        Map<String, Integer> scores = Map.of("Peter", 2, "Paul", 3, "Mary", 5);
        Map<String, Integer> scores2 = Map.ofEntries(
                Map.entry("Peter", 2),
                Map.entry("Paul", 3),
                Map.entry("Mary", 5));

        //以下为可修改的集合
        var names2 = new ArrayList<>(names);
        names2.add("Hello");
        //构造的新集合对象的引用和原先不同
        System.out.println(names2);
        System.out.println(names);


        //对groups操作,groups生成视图，记住只能对new对象进行修改，下述方法会报UnsupportedOperationException异常
        //List<String> groups = names.subList(0, 2);
        //下述方法才行
        List<String> groups = names2.subList(0, 2);
        groups.clear();
        System.out.println(names2);

    }
}
