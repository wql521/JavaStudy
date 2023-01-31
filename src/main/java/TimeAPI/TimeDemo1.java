package TimeAPI;

import java.util.Date;

public class TimeDemo1 {
    public static void main(String[] args) {
        //1.创建对象表示一个事件
        Date date = new Date();
        System.out.println(date);

        //2.创建对象表示一个指定时间
        Date date1 = new Date(0L);
        System.out.println(date1);

        //3.setTime 修改时间
        //1000毫秒 = 1秒
        date1.setTime(1000L);
        System.out.println(date1);

        //4.getTime 获取当前时间的毫秒值
        long time = date1.getTime();
        System.out.println(time);
    }
}
