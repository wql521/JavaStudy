package ValueDemo;

public class continueDemo {
    public static void main(String[] args) {
        //1.跳过某次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //结束本次循环，继续下次循环
                continue;
            }
            System.out.println("吃第" + i + "个包子");
        }
    }
}
