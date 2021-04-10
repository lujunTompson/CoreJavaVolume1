package JavaCore.Ninth;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }

        Integer[] nums = new Integer[] {Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)};
        List<Integer> ints = Arrays.asList(nums);
        ints.add(3);
        System.out.println(ints.toString());
    }

    static void badMethod() throws Exception {
        throw new Exception();
    }
}
