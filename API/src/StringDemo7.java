public class StringDemo7 {
    public static void main(String[] args) {
        //以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
        //最终效果为：`131****9468`
        //1.先获取手机号
        String phone = "13132439468";
        //2.截取手机号前面3位
        String start = phone.substring(0,3);
        //3.截取手机号后面3位
        String end = phone.substring(7);
        //4.拼接
        String result = start + "****" + end;
        //5.打印
        System.out.println(result);
    }
}
