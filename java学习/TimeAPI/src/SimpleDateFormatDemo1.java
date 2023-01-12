import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //1.利用空参构造创件SimpleDateFormat对象，默认格式
        SimpleDateFormat simpleDateFormatDemo1 = new SimpleDateFormat();
        Date date = new Date(0L);
        //format格式化(日期对象 转为 字符串)
        String st = simpleDateFormatDemo1.format(date);
        System.out.println(st);

        //2.利用带参构造创件SimpleDateFormat对象，指定格式
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年M月d日 HH:mm:ss EE");
        String st1 = simpleDateFormat1.format(date);
        System.out.println(st1);

        //3.定义一个字符串表示时间
        String stTime = "2023-01-01 11:11:11";
        //利用有参构造创件SimpleDateFormat对象
        //创建对象的格式要和字符串的格式完全一样
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = simpleDateFormat2.parse(stTime);
        System.out.println(date1);
        System.out.println(date1.getTime());
    }
}
