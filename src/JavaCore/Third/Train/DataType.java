package JavaCore.Third.Train;

public class DataType {
    public static void main(String[] args) {
        int a;
        short b;
        long c = 40;
        //十六进制
        int d = 0x56;
        //二进制
        int e = 0b10010;
        //数字中加下划线,readable
        long f = 36_100_405;
        byte g = 127;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //得到0-255的int值，若g为负数，则+256，否则以原数转换
        int i = Byte.toUnsignedInt(g);
        System.out.println(i);
    }
}
