package MethodDemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        int as = sum(1, 2);
        System.out.println(as);
        int as1 = sum(1, 2, 3);
        System.out.println(as1);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
