import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //	键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
        //1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String st = sc.next();
        //2.统计
        //定义三个计数器
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            //char类型的变量在参与计算的时候自动类型提升为int，查询ASCII码表
            if (c >= 'a' && c <= 'z'){
                smallcount++;
            } else if (c >= 'A' && c <= 'A') {
                bigcount++;
            } else if (c >= '0' && c <= '9') {
                numbercount++;
            }
        }
        //3.当循环结束之后，三个变量记录的就是对应的个数
        System.out.println("大写字符有:" + bigcount + "个");
        System.out.println("小写字符有:" + smallcount + "个");
        System.out.println("数字字符有:" + numbercount + "个");
    }
}
