package JavaCore.Sixth.Lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator.*;
import java.util.Date;

import static java.util.Comparator.*;


public class LambdaTest {
    public static void main(String[] args) {
        var planets = new String[] {"Mercury", "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted by length:");
        Arrays.sort(planets,(first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        //使用Comparator接口中的静态方法
        Arrays.sort(planets, comparingInt(String::length));
        System.out.println(Arrays.toString(planets));

        //第三种比较方法
        Arrays.sort(planets, comparing(String::length, nullsFirst(naturalOrder())));
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();

        //keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);


    }
}
