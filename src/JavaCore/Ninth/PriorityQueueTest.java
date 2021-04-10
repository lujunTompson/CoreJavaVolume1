package JavaCore.Ninth;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * 优先队列本质即为最小堆，典型用法是任务调度
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1996, 12, 3));
        pq.add(LocalDate.of(1936, 12, 3));
        pq.add(LocalDate.of(1946, 12, 3));
        pq.add(LocalDate.of(1956, 12, 3));
        System.out.println("Iterating over elements...");
        //迭代并非按照有序顺序来访问元素
        for (LocalDate date : pq)
            System.out.println(date);

        System.out.println("Removing elements ...");
        while (!pq.isEmpty())
            //删除操作总是删除最小的元素
            System.out.println(pq.remove());
    }
}
