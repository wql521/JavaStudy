import java.util.Random;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        /*程序自动生成一个1-100之间的随机数字
        * 使用程序实现猜出这个数字是多少*/

        //扩展增加一个抽奖机制，猜了3次没中，第四次提示猜中
        //计数器
        int count = 0 ;
        //1.先获取一个随机数
        //范围0-10
        Random r = new Random();
        //生成随机数
        //在小括号中，书写的是生成随机数的范围
        //这个范围一定是从0开始的
        //到这个数-1结束
        //口诀：包头不包尾，包左不包右
        int number = r.nextInt(101);//0-100
        //2.猜这个数字是多少
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要猜的数字:");
            int guessNumber = sc.nextInt();
            count ++;
            if (count == 3){
                System.out.println("猜中了");
                break;
            }
            //3.判断两个数字给出不同的提示
            if (guessNumber > number){
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            }else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
