package JavaCore.Third.Train;

public class Loop {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--)
            System.out.println("Counting down ... " + i);
        //重写为while
        int i = 10;
        while (i > 0) {
            System.out.println("Counting down ... " + i);
            i--;
        }
    }
}
