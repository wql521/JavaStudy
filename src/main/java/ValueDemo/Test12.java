package ValueDemo;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        /*键盘录入一个正整数x，判断该整数是否是一个质数*/
        //质数：
        //如果一个数字只能被1和他本身整除，那么这个数字是质数，否则这个数字是合数

        //1.键盘录入一个正整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数:");
        int x = sc.nextInt();

        //定义一个变量，记录能被整除的次数
        int count = 0;
        //2.利用for循环输出1-x范围内的每一个数，并且进行判断
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(x + "是质数");
        } else {
            System.out.println(x + "不是质数");
        }
    }
}
