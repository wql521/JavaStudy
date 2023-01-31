package ValueDemo;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*键盘录入一个大于等于2的整数x，计算并返回x的平方根
         * 结果只保留整数部分，小数部分将被舍去*/
        //分析：
        //平方根 16的平方根4
        //10
        //1 * 1 =1 < 10
        //2 * 2 =4 < 10
        //3 * 3 =9 < 10
        //4 * 4 =16> 10
        //推断：10的平方根在3-4之间
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        //如果小于的，继续往后进行判断
        //如果大于的，前一个数字就是平方根的整数
        //1.键盘录入一个大于等于2的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int number = sc.nextInt();
        //2.利用for循环
        //从1开始，number结束
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(number + "的平方根的整数部分" + i);
                break;
            } else if (i * i > number) {
                System.out.println(number + "的平方根的整数部分" + (i - 1));
                break;
            }
        }
    }
}
