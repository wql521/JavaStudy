import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) throws ParseException {
        /*将出生年月日：2000-11-11
        * 用字符串表示这个数据，并将其转换为2000年11月11日*/
        //1.通过对2000-11-11解析，解析成一个Date对象
        String st = "2000-11-11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(st);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日");
        String s = simpleDateFormat1.format(date);
        System.out.println(s);
    }
}
