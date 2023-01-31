package ValueDemo;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");//abc bcd
        String str1 = sc.next();
        System.out.println(str1);//abc
        System.out.println("请输入第二个字符串");
        String str2 = sc.next();
        System.out.println(str2);//bcd

        System.out.println("请输入一个字符串");//abc bcd
        String str3 = sc.nextLine();
        System.out.println(str3);//abc
        System.out.println("请输入第二个字符串");
        String str4 = sc.nextLine();
        System.out.println(str4);//bcd
    }
}
