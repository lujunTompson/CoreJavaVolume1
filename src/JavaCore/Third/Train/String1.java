package JavaCore.Third.Train;

public class String1 {
    public static void main(String[] args) {
        String e = "";
        String greeting = "Hello";
        //substring 获取字串
        String s = greeting.substring(0, 3);
        System.out.println(s);
        //字符串拼接
        int age = 23;
        String rating = "PG" + age;
        System.out.println(rating);
        //将多个字符串连接在一起，使用一个界定符分隔
        String all = String.join(",", "Java", "Python", "C++");
        System.out.println(all);
        //检测字符串是否相等
        boolean result = rating.equals(all);
        System.out.println(result);
        all = "PG23";
        System.out.println(all.equals(rating));

        char h = 'A';
        h = (char) (h + 3);
        System.out.println(h);

        int i = Integer.parseInt("12");
        System.out.println(i + 3);
    }
}
