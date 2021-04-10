package JavaCore.Third.Train;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] smallPrimes = {2, 3, 5, 7, 11,};
        String[] authors = {
                "James Gosling",
                "Bill Joy",
                "Guy Steele",
        };
        //声明长度为0的数组
        int[] b = new int[0];
        for(int i =0; i < a.length; i++)
            a[i] = i;
        System.out.println(smallPrimes.length);
        //for each 循环
        for (int element : a)
            System.out.println(element);
        //打印数组中的所有值
        System.out.println(Arrays.toString(a));
        //数组拷贝
        int[] luckyNumbers = smallPrimes;
        //看源码，重新分配了内存，所以只需声明数组，不需初始化
        int[] copiedLuckyNumber = Arrays.copyOf(smallPrimes, smallPrimes.length);
        luckyNumbers[4] = 12;
        System.out.println(copiedLuckyNumber[4]);
        System.out.println(smallPrimes[4]);

        int[] clone = smallPrimes.clone();
        int[] newClone  = Arrays.stream(clone).toArray();
        newClone[0] = 8;
        System.out.println(clone[0] + " " + newClone[0]);

        //List -- > Array
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        int[] ints = l1.stream().mapToInt(Integer::valueOf).toArray();
        double[] doubles = l1.stream().mapToDouble(Double::valueOf).toArray();
        System.out.println(doubles[0]);

        StringBuffer sb = new StringBuffer();
        String s = sb.reverse().toString();
        System.out.println(s);
        int x = 3;
        x = -x;


        List<Integer> test1 = new LinkedList<>();
        test1.add(1);
        test1.add(2);
        System.out.println(test1.toString());
        test1.remove(0);
        System.out.println(test1);

        PriorityQueue<Integer> f = new PriorityQueue<>(3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        String num = "12";
        Map<String, Function<String, Long>> sorts = new HashMap<>();
    }
}
