import java.util.Scanner;
import java.util.StringJoiner;

public class Test8 {
    public static void main(String[] args) {
        /* 键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
                将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：
        Ⅰ－1、Ⅱ－2、Ⅲ－3、Ⅳ－4、Ⅴ－5、Ⅵ－6、Ⅶ－7、Ⅷ－8、Ⅸ－9
        注意点：
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/
        //1.键盘录入一个字符串
        String st;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("请输入一个字符串:");
            st = sc.next();
            boolean flag = checkst(st);
            if (!flag){
                System.out.println("字符串不符合规则，请重新输入");
            }else {
                break;
            }
        }
        StringJoiner result = new StringJoiner(",","[","]");
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            String luoma = changeluoma(c-48);
            result.add(luoma);
        }
        String result1 = result.toString();
        System.out.println(result1);
    }
    public static String changeluoma(int number){
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅸ"};
        return arr[number];
    }
    //定义一个方法对字符串进行判断
    //要求1：长度为小于等于9
    //要求2：只能是数字
    public static boolean checkst(String st){
        //要求1：长度为小于等于9
        if (st.length() > 9){
            return false;
        }
        //要求2：只能是数字
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c > '9' || c < '0'){
                return false;
            }
        }
        //最后返回正确
        return true;
    }
}
