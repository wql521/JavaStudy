public class Game1 {
    public static void main(String[] args) {
        //游戏：逢7过
        /*游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或7的倍数时都要说过
        * 需求：使用程序在控制台打印1-100之间满足逢7过规则的数据*/
        //1.得到1-100之间的每一个数字
        for (int i = 1;i <= 100;i++){
            if (i % 10 ==7 || i /10 %10 ==7 || i % 7==0){
                System.out.println('过');
                continue;
            }
            System.out.println(i);
        }

    }
}
