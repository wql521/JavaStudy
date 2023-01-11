import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        //键盘输入一个三位数,获取其中的个位,十位,百位

        //1.键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();

        //获取个位,十位,百位
        //个位  数字 % 10
        //十位  数字 /10 % 10
        //百位  数字 /100 % 10
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        //打印输出
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
