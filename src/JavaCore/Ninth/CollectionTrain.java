package JavaCore.Ninth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTrain {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("Chao");
        Iterator<String> iter = c.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }

        //for each 循环
        //标准类库中的任何集合都可以使用 for-each循环
        for (String e:
             c) {
            System.out.println(e);
        }

        //对迭代器的每一个元素
        iter.forEachRemaining(System.out::println);

        //删除元素(第一个)
        Iterator<String> it = c.iterator();
        it.next();
        it.remove();
        System.out.println(c);
    }
}
