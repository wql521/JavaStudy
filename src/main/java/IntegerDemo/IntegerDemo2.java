package IntegerDemo;

import java.util.Scanner;

public class IntegerDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        int i = Integer.parseInt(st); //String转换成整数类型

        System.out.println(st);
        System.out.println(i + 1);

        System.out.println("--------");
        int number = 10;
        String s2 = String.valueOf(number);

        System.out.println(s2);

        System.out.println("--------");
    }
}
