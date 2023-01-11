public class addDemo {
    public static void main(String[] args) {
        //求1-5的和

        //分析
        //1.循环1-5里面的每一个数字
        //开始条件:1
        //结束条件:5
        int sum = 0; //用来进行累加
        for (int i = 1;i <= 5;i++){
            System.out.println(i);
            sum += i;
        }
        //打印累加结果
        System.out.println(sum);
    }
}
