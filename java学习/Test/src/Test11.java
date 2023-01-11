public class Test11 {
    /* 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。*/
    //不需要考虑乘积过大之后的结果
    //就认为乘积一定是小于int的最大值的
    public static void main(String[] args) {
        //1.定义两个字符串表示的非负整数
        String num1 = "12349";
        String num2 = "123";
        int number1 = toint(num1);
        int number2 = toint(num2);
        int result = number1 * number2;
        System.out.println(result);
        String newresult = tostr(result,count(result));
        System.out.println(newresult);
    }
    //获取整数的长度
    public static int count(int number){
        int coun = 0;
        while (true){//123
            number = number / 10; //12 //1 //0
            coun ++; //1 //2 //3
            if (number == 0){
                break;
            }
        }
        return coun;
    }
    //将整数变为字符串
    public static String tostr(int number,int length){
        //创建一个字符数组存储
        char[] arr = new char[length];
        //遍历获取个位数字
        for (int i = length-1; i >= 0; i--) {
            //获取个位
            int ge = number % 10; //3 //2
            //将个位数字去掉
            number = number / 10; //12 //1
            char c = (char)(ge + 48);
            arr[i] = c;
        }
        return new String(arr);
    }
    //将字符串变为整数
    public static int toint(String num){
        //遍历字符串
        int result = 0;
        int flag = 0;
        for (int i = num.length()-1; i >= 0; i--) {
            char c = num.charAt(i);
            int number = c - 48;
            int center = 1;
            for (int i1 = 0; i1 < flag; i1++) {
                center = center * 10;
            }
            result = result + number * center;
            flag++;
        }
        return result;
    }

}
