package BigIntegerAPI;

import java.math.BigInteger;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        //获取一个随机的大整数
        Random r = new Random();
        BigInteger randomBigint = new BigInteger(10, r);
        System.out.println(randomBigint);

        //获取一个指定的大整数
        BigInteger bd = new BigInteger("99999999");
        System.out.println(bd);

        //获取指定进制的大整数
        BigInteger bd11 = new BigInteger("110", 2);
        System.out.println(bd11);

        //静态方法获取BigInteger对象，内部有优化
        BigInteger bd22 = BigInteger.valueOf(100);
        System.out.println(bd22);


    }
}
