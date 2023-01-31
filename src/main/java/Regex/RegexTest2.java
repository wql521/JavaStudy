package Regex;

public class RegexTest2 {
    public static void main(String[] args) {
        /*
            正则表达式练习:
            需求
            请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位
            请编写正则表达式验证身份证号码是否满足要求。
            简单要求:
                18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
            复杂要求:
                按照身份证号码的格式严格要求。

            身份证号码:
            41080119930228457x
            510801197609022309
            15040119810705387X
            130133197204039024 I
            430102197606046442
        */
        String regex1 = "[0-9a-zA-Z]{4,16}";
        System.out.println("wangqwu".matches(regex1));

        String regex2 = "[1-9]\\d{16}(\\d|(?i)x)";
        String regex3 = "[1-9]\\d{16}[\\dXx]";
        System.out.println("41080119930228457x".matches(regex2));

        //忽略后面数据的大小写
        String regex4 = "(?i)abc";
        System.out.println("abc".matches(regex4));


    }
}
