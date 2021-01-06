package JavaCore.Third.Train;

import java.util.Date;

public class FormatOutput {
    public static void main(String[] args) {
        float x = 100.0f / 3;
        System.out.println(x);
        double y = 100.0 / 3;
        System.out.println(y);
        //格式化输出
        System.out.printf("%6.2f", y);
        //提供多个参数的printf
        String name = "ChaoWang";
        int age = 23;
        System.out.printf("Hello, %s. Next year, you'll be %d", name, (age+1));
        System.out.println("");
        //指定格式化输出的各种标志
        System.out.printf("%,.2f", 100000.0 / 3);
        //可以使用多个标志
        System.out.println("");
        System.out.printf("%,+.1f", 10000.0 / 3);
        //不打印输出，产生一个格式化的字符串
        System.out.println("");
        String message = String.format("%,+.1f", 10000.0 / 3);
        System.out.println(message);
        //打印日期和时间
        System.out.printf("%tc", new Date());
        //结合参数索引
        System.out.println("");
        System.out.printf("%1$s %2$tB %<te %<tY", "Today is ", new Date());
    }
}
