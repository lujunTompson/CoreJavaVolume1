package JavaCore.Third.Train;

public class Operator3 {

    public static void main(String[] args) {
        int a = 0b1011;
        System.out.println(a);
        System.out.println("the result is " + false);

        //位运算符
        int n = 15;
        int fourthBitFromRight = (n & 0b1000) / 0b1000;
        System.out.println(fourthBitFromRight);
        //右移运算符
        System.out.println(1 << 3);
        //左移运算符:除以2的商
        n = n >> 1;
        System.out.println(n);
    }
}
