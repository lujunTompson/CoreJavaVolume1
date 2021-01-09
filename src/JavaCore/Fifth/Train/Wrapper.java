package JavaCore.Fifth.Train;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        //autoboxing == list.add(Integer.valueOf(3)0
        list.add(3);
        //自动拆箱
        int n = list.get(0);
        Integer m = 3;
        m++;
        //数字字符串转化为数值
        int x = Integer.parseInt("234");
        x += 6;
        System.out.println(x);

        //参数数量可变
        double max = max(3.1, 4.2, 9.8);
        System.out.println(max);

        //使用枚举类型
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size=" + size);
        String s = size.toString();
        System.out.println(s);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
    }

    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) if (v > largest) largest = v;
        return largest;
    }

}

enum Size {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;

    private Size(String abbreviation) { this.abbreviation = abbreviation; }
    public String getAbbreviation() {return abbreviation; }
}
