import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*给一个整数x，如果x是一个回文数，打印true，否则，返回false
        * 回文数：121
        * 不是回文数：123
        * 回文数是指从正序和倒序读都是一样的整数*/

        //思路：将数字倒过来跟原来的数字进行比较
        //键盘输入一个整数
        Scanner  sc = new Scanner(System.in);
        //1.输入需要判断的整数
        System.out.println("请输入需要判断的整数:");
        int number = sc.nextInt();
        //定义一个临时变量进行记录最初的值，用于最后的比较
        int temp = number;
        //定义结果变量
        int result = 0;
        //利用while循环进行判断
        while (number != 0){
            //2.从右往左依次获取每一位数字
            int ge = number % 10; //取余
            //修改输入的值
            number = number / 10; //整数参与计算,结果只能得到整数
            //将当前获取的数字进行拼接
            result = result *10 + ge;
        }
        //3.打印结果
        System.out.println(temp == result);
    }
}