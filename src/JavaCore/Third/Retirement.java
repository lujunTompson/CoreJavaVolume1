package JavaCore.Third;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        //read input
        Scanner in = new Scanner(System.in);

        System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.println("How much money do you deposit every year?");
        double payment = in.nextDouble();

        System.out.println("Please tell me the interest rate.");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.printf("You need %d years to retire", years);
    }
}
