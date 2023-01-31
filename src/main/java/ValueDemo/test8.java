package ValueDemo;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        /*键盘录入两个整数，表示一个范围
         * 统计这个范围里既能被3整除，又能被5整除的数字有多少？*/

        //1.键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示范围的结束");
        int end = sc.nextInt();
        //定义一个变量记录个数
        int count = 0;
        //2.利用循环获取范围里的每一个整数
        //开始是start
        //结束是end
        for (int i = start; i <= end; i++) {
            //3.对每个数字进行判断
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        //打印输出结果
        System.out.println("既能被3整除，又能被5整除的数字有" + count + '个');
    }
}
