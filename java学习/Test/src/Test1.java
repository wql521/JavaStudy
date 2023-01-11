import java.util.Scanner;

public class Test1 {
    /*机票价格按照淡季和旺季,头等舱和经济舱收费,输入机票原价、月份和头等舱或经济舱
    * 按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季（11月-来年4月）头等舱7折，经济舱6.5折*/
    public static void main(String[] args) {
        //1.键盘录入机票原价、月份、头等舱或经济舱
        Scanner sc= new Scanner(System.in);
        System.out.print("请输入机票原价:");
        int ticket = sc.nextInt();
        System.out.print("请输入当前的月份:");
        int month = sc.nextInt();
        System.out.print("请输入当前购买的舱位 0 头等舱 ； 1 经济舱:");
        int set = sc.nextInt();
        //2.判断月份是旺季还是淡季
        switch (month){
            //淡季
            case 11,12,1,2,3,4 -> ticket = getPrice(ticket,set,0.7,0.65);
            //旺季
            case 5,6,7,8,9,10 -> ticket = getPrice(ticket,set,0.9,0.85);
            default -> System.out.println("输入的月份不合理");
        }
        //3.打印价格
        System.out.println(ticket);
    }
    public static int getPrice(int ticket,int set,double v0,double v1){
        if (set == 0){
            //头等舱
            ticket = (int)(ticket * v0);
        } else if (set == 1) {
            ticket = (int) (ticket * v1);
        }else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
