package JavaCore.Third;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double balance = 0;
        int years = 0;
        String answer;

        System.out.println("How much money do you deposit every year?");
        double payment = in.nextDouble();

        System.out.println("Please tell me the interest rate.");
        double interestRate = in.nextDouble();

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
            //print current year and balance
            System.out.printf("You have %2.2f dollars in %d years%n", balance, years);
            //ask if ready to retire
            System.out.println("Are you ready to retire? (Y/N)");
            answer = in.next();
        }
        while (answer.equals("N"));
    }
}
