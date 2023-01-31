package ValueDemo;

public class addDemo2 {
    public static void main(String[] args) {
        //求1-100之间的偶数和
        //定义结果变量
        int sum = 0;
        //1.获取1-100之间的每个数
        for (int i = 1; i <= 100; i++) {
            //2.累加求和(先判断,在求和)
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
