package login;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "wangwu";
        String rightUserpasswd = "123456";

        //2.键盘录入用户名和密码
        for (int i = 0; i < 3; i++) { //0 1 2
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入用户名：");
            String username = sc.next();
            System.out.print("请输入密码：");
            String userpasswd = sc.next();

            //比较
            if (username.equals(rightUsername) && userpasswd.equals(rightUserpasswd)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号被锁定");
                } else {
                    System.out.println("用户登陆失败，用户名或密码错误，您还有" + (2 - i) + "次机会"); //2 1 0
                }
            }
        }
    }
}
