package JavaCore.Third.Train;

import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);
        BigInteger reallyBig = new BigInteger("33333333333333333388888888888888888");
        //c = a + reallyBig
        BigInteger c = a.add(reallyBig);
        System.out.println(c);
        //d = a * reallyBig
        BigInteger d = a.multiply(reallyBig);
        System.out.println(d);
    }
}
