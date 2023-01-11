public class test3 {
    public static void main(String[] args) {
        //自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
        //153 = 1^3 + 5^3 + 3^3
        //统计一共有多少个这样的三位数
        int cout = 0;
        for (int i = 100; i <= 999; i++) {
            //循环得到个位数字，十位，百位
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i / 100 % 10;

            int sum = (int) (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3));
            if (sum == i){
                cout++;
                System.out.println(i);
            }
        }

        System.out.println("一共有"+cout+"个");
    }
}
