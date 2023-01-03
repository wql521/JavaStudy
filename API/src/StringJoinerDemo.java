import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        //1.创建一个对象，并且指定中间间隔
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        String st = sj.toString();
        System.out.println(st);

        //2.创建一个对象，指定中间，开始，结束
        StringJoiner sj1 = new StringJoiner(",","[","]");
        String st1 = sj1.add("1").add("2").add("3").toString();
        System.out.println(st1);
    }
}
