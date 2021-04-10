package JavaCore.Seventh;

import java.util.Scanner;

/**
 * A program that displays a trace feature of a recursive method call
 * @version 1.1 2021-1-18
 * @author chao.wang
 */
public class StackTraceTest {
    /**
     * Computes the factorial of a number
     * @param n a non-negative integer
     * @return n! = 1 * 2 * 3 * ... * n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        //display the trace
        StackWalker walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        walker.forEach(stackFrame ->
            System.out.println(stackFrame.getClassName())
        );
        //end
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n-1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        try(var in = new Scanner(System.in))
        {
            System.out.println("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }
}
