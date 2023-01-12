import java.util.Date;

public class TimeTest1 {
    public static void main(String[] args) {
        /*
        * 需求：打印时间原点开始一年后的时间
        * */
        //需求1：打印时间原点开始一年之后的时间
        //1.创建一个对象，表示时间原点
        Date date = new Date(0L);
        //2.获取时间的毫秒值
        long time = date.getTime();
        //3.在这个基础上加上一年的毫秒值
        time = time + 1000L*60*60*24*365;
        //4.把计算之后的时间毫秒值，再设置
        date.setTime(time);
        System.out.println(date);
    }
}
