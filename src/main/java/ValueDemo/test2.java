package ValueDemo;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
      /*键盘输入两个整数
        分别表示你和对象的时髦度(在0-10范围内)
        如果你的时髦度大于你对象的时髦度,表示相亲成功
        成功为true,失败为false*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度:");
        int myfashion = sc.nextInt();
        System.out.println("请输入对象的时髦度:");
        int girlfashion = sc.nextInt();

        boolean result = myfashion > girlfashion;

        System.out.println(result);
    }
}
