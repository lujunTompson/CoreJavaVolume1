package JavaCore.Third;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the total number.");
        int total = in.nextInt();

        System.out.println("Please input the number you will extract");
        int k = in.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (total - i + 1) / i;
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
