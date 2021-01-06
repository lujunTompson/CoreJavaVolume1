package JavaCore.Third.Train;

import java.util.Arrays;

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
        int[] copiedLuckyNumber = Arrays.copyOf(smallPrimes, smallPrimes.length);
        luckyNumbers[4] = 12;
        System.out.println(copiedLuckyNumber[4]);
        System.out.println(smallPrimes[4]);
    }
}
