package JavaCore.Third;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the total number.");
        int total = in.nextInt();

        System.out.println("Please input the number you will extract");
        int k = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(total-i+1)).divide(BigInteger.valueOf(i));
        }
        System.out.println(lotteryOdds);
    }
}
