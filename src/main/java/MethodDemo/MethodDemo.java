package MethodDemo;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String guess = sc.next();
        if (guess.equals("whoseName")) { //名字暂定，还在寻找🥺
            System.out.println("你是if后面第一个语句体");
            myWhole(18);
        } else {
            System.out.println("其他人是else后面的语句体");
        }
    }

    public static void myWhole(int life) {
        int end = 10000;
        while (life < end) {
            int love = 0;
            love++; //当生命没有终止，爱你不断;
        }
        System.out.println("You are my whole world"); //你是我的整个世界.
    }
}
