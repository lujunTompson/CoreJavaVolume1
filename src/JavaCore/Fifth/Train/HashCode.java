package JavaCore.Fifth.Train;

public class HashCode {
    public static void main(String[] args) {
        var s = "OK";
        var sb = new StringBuilder(s);
        //字符串的散列码由内容导出 Object类的默认hashCode方法从对象的存储地址得出
        System.out.println(s.hashCode() + " " + sb.hashCode());
        var t = new String("OK");
        var tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }
}
