package JavaCore.Seventh;

import java.util.*;
import java.util.logging.Logger;

public class LogTest {
    public static void main(String[] args) {
        Logger.getGlobal().info("FIle->Open menu item selected");
        String s = "sdg";
        String substring = s.substring(0, 0);
        System.out.println(substring);
        System.out.println(s.length());
        String[] m = {"1"};
        System.out.println(m.length);
        Arrays.sort(m, Comparator.comparingInt(String::length));
        StringBuffer ret = new StringBuffer("");
        String s1 = ret.toString();
        String[] t = {};
        String[] t2 = null;
        System.out.println(t.length);
//        System.out.println(t2.length);
        Stack<Character> characters = new Stack<>();
        characters.isEmpty();
        Deque<Character> stack = new LinkedList<Character>();
        stack.push('s');
        stack.pop();
        stack.peek();
        int left = 0;
        int right = 3;
        System.out.println((left + right) >>> 1);

        int n = 3;
        n >>= 1;
        System.out.println(n);
    }
}
