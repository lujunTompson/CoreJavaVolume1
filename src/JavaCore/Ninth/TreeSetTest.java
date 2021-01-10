package JavaCore.Ninth;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        //TreeSet对元素进行了排序
        var parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4532));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        //可以在构造函数中给出Comparator接口比较函数
        var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);

        Comparator<? super Item> comparator = sortByDescription.comparator();

        //双端队列
        Deque<Item> s = new ArrayDeque<>();
        //删除并返回parts中的最大元素
        s.addFirst(parts.pollFirst());
        s.addFirst(parts.pollFirst());
        System.out.println(s);
    }
}
