package Regex;

public class RegexDemo1 {
    /* 假如现在要求校验一个qq号码是否正确。
            规则:6位及20位之内，0不能在开头，必须全部是数字。
            先使用目前所学知识完成校验需求然后体验一下正则表达式检验。
        */
    public static void main(String[] args) {
        String QQ = "1234567890";
        boolean res = checkQQ(QQ);
        System.out.println(res);

        //正则表达式
        System.out.println(QQ.matches("[1-9]\\d{5,19}"));
    }

    public static boolean checkQQ(String qq) {
        if (qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        //不能是0开头
        if (qq.startsWith("0")) {
            return false;
        }

        //全部是数字
        char[] arr = qq.toCharArray();
        for (char c : arr) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
