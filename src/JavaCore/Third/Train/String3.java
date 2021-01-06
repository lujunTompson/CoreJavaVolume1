package JavaCore.Third.Train;

public class String3 {
    public static void main(String[] args) {
        //构建字符串，多次使用
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append("Yes");
        builder.append("No");
        //在指定位置插入一个值
        builder.insert(1," ");
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
