package Regex;

public class RegexTest1 {
    /*
            需求
            请编写正则表达式验证用户输入的手机号码是否满足要求。请编写正则表达式验证用户输入的邮箱号是否满足要求。请编写正则表达式验证用户输入的电话号码是否满足要求。
            验证手机号码 13112345678 13712345667 13945679027 139456790271
            验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
            验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        */
    public static void main(String[] args) {
        String phone = "13112345678";
        boolean res = phone.matches("[1][3-9]\\d{9}");
        System.out.println(res);

        String homePhone = "020-2324242";
        boolean res1 = homePhone.matches("0\\d{2,3}-?[1-9]\\d{4,9}");
        System.out.println(res1);

        String email = "3232323@qq.com";
        String email1 = "dlei0009@pci.com.cn";
        boolean res2 = email.matches("\\w+@[\\w&&[^_]]{2,6}(.[a-zA-Z]{2,3}){1,2}");
        boolean res3 = email1.matches("\\w+@[\\w&&[^_]]{2,6}(.[a-zA-Z]{2,3}){1,2}");
        System.out.println(res2);
        System.out.println(res3);
    }
}
