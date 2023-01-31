package Test;

public class Test2 {
    /*判断101-200之间有多少个素数，并输出所有素数*/
    public static void main(String[] args) {
        //定义一个变量统计多少个
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = getResult(i);
            if (flag) {
                System.out.println(i + "是质数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个质数");
    }

    public static boolean getResult(int i) {
        //j表示2-i-1之间的每一个数字
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
