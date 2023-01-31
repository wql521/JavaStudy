package CalendarAPI;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //1.获取日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //2.修改一下日历代表的时间
        Date date = new Date(0L);
        calendar.setTime(date);
        System.out.println(calendar);

        //3.获取数组中具体信息
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "," + month + "," + date1);

        //4.修改时间
        calendar.set(Calendar.YEAR, 2023);
        year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        //5.增删
        calendar.add(Calendar.YEAR, 1);
        year = calendar.get(Calendar.YEAR);
        System.out.println(year);
    }
}
