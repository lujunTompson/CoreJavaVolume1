package JavaCore.Ninth;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        int[] clone = a.clone();

        boolean b = "nist" instanceof String;
        System.out.println(b);

        //first way to know the type of one variable
        String simpleName = "nist".getClass().getSimpleName();
        System.out.println(simpleName.equals("String"));
        //the output is java.lang.String
        String complexName = "nist".getClass().getName();
        System.out.println(complexName);

        //排序
        String[] strings = new String[] {"10", "0", "2", "String"};
        List<String> strings1 = Arrays.asList(strings);
        //按字典序排序
        Collections.sort(strings1);
        System.out.println(strings1.toString());
        //法2
        strings1.sort(Comparator.comparing(String::toString));
        System.out.println(strings1.toString());
        //法三
        strings1.sort(String::compareTo);
        System.out.println(strings1.toString());
        //法四 (比较长度）
        strings1.sort((first, second) -> first.length() - second.length());
        strings1.sort(Comparator.comparingInt(String::length));
        System.out.println(strings1.toString());

        int[] m = new int[]{1, 2, 3};
        int[] clone1 = m.clone();
        clone1[0] = 3;
        System.out.println(clone1[0] + " " + m[0]);
        int[] tt = new int[4];
        Arrays.fill(tt, 3);

        List<Integer> x = new LinkedList<>();
        System.out.println(x.isEmpty());

        List<Integer> aaa = null;


    }
}
