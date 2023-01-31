package TimeAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        //1.获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);

        //2.根据(秒/毫秒纳秒/)获取Instant对象
        Instant instant = Instant.ofEpochMilli(0L);//毫秒
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(1L); //秒
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L); //纳秒
        System.out.println(instant2);

        //3.指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        //4.判断
        //isBefore: 判断调用者代表的时间是否在参数表示时间的前面
        //isAfter: 判断调用者代表的时间是否在参数表示时间的后面
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);
        boolean res = instant3.isBefore(instant4);
        System.out.println(res);

        boolean res2 = instant3.isAfter(instant4);
        System.out.println(res2);

        //5.增减时间序列
        Instant instant5 = Instant.ofEpochMilli(3000L);
        System.out.println(instant5);

        Instant instant6 = instant5.minusMillis(1000L);//减1秒
        System.out.println(instant6);

        Instant instant7 = instant5.plusMillis(1000L);//加1秒
        System.out.println(instant7);
    }
}
