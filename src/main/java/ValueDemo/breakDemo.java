package ValueDemo;

public class breakDemo {
    public static void main(String[] args) {
        //1.结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("吃第" + i + "个包子");
            if (i == 3) {
                //结束整个循环
                break;
            }
        }
    }
}