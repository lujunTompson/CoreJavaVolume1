package JavaCore.Third.Train;

public class String2 {
    public static void main(String[] args) {
        //空串检查
        String str = "";
        System.out.println(str.length());
        System.out.println(str.equals(""));
        //Null串
        System.out.println(str == null);
        //检查既不是null又不是空串
        str = "Hello";
        if (str != null && str.length() != 0) {
            System.out.println(str + " 不是null也不为空");
        }

        //一些常用的api
        if (str.startsWith("H") && str.startsWith("Hel")) {
            System.out.println(str + " 确实以给定前缀开头");
        }
        //返回与给定字符串相匹配的开始位置
        int e = str.indexOf("Hel",1);
        System.out.println(e);
        // 代替
        String bookList = "Java, Python, C++";
        String newBookList = bookList.replace(", ", "/");
        System.out.println(newBookList);

    }
}
