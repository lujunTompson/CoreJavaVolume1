package JavaCore.Sixth.Train;

import java.util.Arrays;

public class InterfaceTest {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }
}
