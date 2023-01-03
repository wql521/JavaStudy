public class StringDemo5 {
    public static void main(String[] args) {
        /*定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入 abc，输出结果 cba*/
        String st = reverser("abc");
        System.out.println(st);
    }
    public static String reverser(String st){
        //abc
        String result = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            char c = st.charAt(i);
            result += c;
        }
        return result;
    }
}
