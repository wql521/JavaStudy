import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
      /*键盘录入两个整数
        如果其中一个数是6,最终结果输出为true
        如果两个数相加是6的倍数,最终输出结果为true*/

        //1.键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();

        //2.number1==6 || number2==6||(number1+number2)%6==0满足其中一个输出为true
        boolean result = number1==6 || number2==6 || (number1+number2)%6 ==0 ;
        System.out.println(result);
    }
}
