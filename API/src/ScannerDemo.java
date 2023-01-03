import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个小数:");
        double result = sc.nextDouble();
        System.out.println(result);
    }
}
