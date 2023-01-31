package Test;

import java.util.Random;

public class Test3 {
    /*定义一个方法实现随机产生一个5位的验证码
     * 验证码格式：
     * 长度为5
     * 前四位是大写字母或者小写字母
     * 最后一位是数字*/
    public static void main(String[] args) {
        //定义个字符串接收抽取到的字母数字
        String result = "";
        //随机抽取四次
        for (int i = 0; i < 4; i++) {
            result = result + getRandom();
        }
        //3.随机抽取一个数字0-9
        Random r = new Random();
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
    }

    public static char getRandom() {
        //1.大写字母和小写字母都放在数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母
                chs[i] = (char) (65 + i - 26);
            }
        }
        //2.随机抽取一个字母
        Random r = new Random();
        int randoIndex = r.nextInt(chs.length);
        return chs[randoIndex];//返回一个字母
    }

}
