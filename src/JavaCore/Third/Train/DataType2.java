package JavaCore.Third.Train;

public class DataType2 {
    public static void main(String[] args) {
        double a = 2;
        double b = 1.1;
        //产生舍入误差
        System.out.println(a-b);

        double c = 0/1;
        if (Double.isNaN(c)) {
            System.out.println( c + " is not a number");
        }

        // 为转义序列
        char s = '\u2122';
        System.out.println(s);
        char m = '\u3133';
        System.out.println(m);
        //其他一些转义序列可以出现在字符串或加引号的字符字面量中

    }
}
