package JavaCore.Third;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //get first input
        System.out.println("what is your name? ");
        String name = in.nextLine();

        //get second input
        System.out.println("How old are you? ");
        int age = in.nextInt();

        //display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
