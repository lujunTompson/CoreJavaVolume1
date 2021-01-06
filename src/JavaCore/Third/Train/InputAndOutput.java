package JavaCore.Third.Train;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        //使用Scanner对象读取输入
        Scanner in = new Scanner(System.in);
        System.out.println("what's your name?");
        String name = in.nextLine();
        System.out.println("my name is " + name);

    }
}
