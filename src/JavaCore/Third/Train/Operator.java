package JavaCore.Third.Train;

public class Operator {

    public static void main(String[] args) {
        int a = 15/2;
        int b = 15%2;
        System.out.println(a + " " + b);

        //math function
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);
        //pow得到幂，返回结果为double类型
        y = Math.pow(x, 3);
        System.out.println(y);

        System.out.println(Math.exp(2));

        //得到一个余数，被除数是负数也可
        int z = Math.floorMod(-15,4);
        System.out.println(z);

        double v = Math.atan(3.5);

        //int 转 float 损失一些精度
        int n = 1_234_567_890;
        float f = n;
        System.out.println(f);
    }
}
