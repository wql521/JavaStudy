public class Test10 {
    public static void main(String[] args) {
        /*给定两个整数，被除数和除数（都是正数，不超过int范围）
        * 将两数相除，要求不使用乘法、除法和%运算符
        * 得到商和余数*/
        //分析：被除数/除数=商。。。。余数
        /*
        * int a=100;
        * int b=10;
        * 100-10=90
        * 90-10=80
        * ......
        * 10-10=0(余数)*/

        //1.定义被除数变量
        int a = 100;
        //2.定义除数变量
        int b = 14;
        //3.定义商变量，记录减的次数
        int count = 0;
        //利用while循环获取商和余数
        //只要被除数大于或等于除数，循环一直进行
        while (a >= b){
            a = a-b;
            count++;
        }
        System.out.println("商:"+count+"\n"+"余数:"+a);
    }
}
