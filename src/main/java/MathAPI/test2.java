package MathAPI;

public class test2 {
    public static void main(String[] args) {
        //判断一个数是否为一个质数
        int a = 99;
        System.out.println(Math.sqrt(a));
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("不是质数");
                break;
            }
        }
    }
}
