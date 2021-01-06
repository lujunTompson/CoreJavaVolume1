package JavaCore.Third;

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;
        //allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int i = 0; i <= NMAX; i++) {
            odds[i] = new int[i + 1];
        }
        //访问元素
        for (int i = 0; i < odds.length; i++)
            for (int k = 0; k < odds[i].length; k++) {
                int lotteryOdds = 1;
                for (int m = 1; m <= k; m++) {
                    lotteryOdds = lotteryOdds * (i - m + 1) / m;
                }
                odds[i][k] = lotteryOdds;
            }

        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}
