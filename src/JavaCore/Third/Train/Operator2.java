package JavaCore.Third.Train;

public class Operator2 {

    public static void main(String[] args) {
        //强制类型转换  截断小数部分
        double x = 9.98;
        int nx = (int)x;
        System.out.println(nx);
        //舍入运算
        int nx2 = (int)Math.round(x);
        System.out.println(nx2);

        //结合“赋值和”运算符,自动进行强制类型转换
        int y = 5;
        y += 3.5;
        System.out.println(y);

        //自增自减运算符
        int z = 3;
        z++;
        System.out.println(z);
        z--;
        System.out.println(z);

        //三元操作符,返回较小数
        double m = x < y ? x : y;
        System.out.println(m);
    }
}
