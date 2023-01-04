import java.util.Random;
import java.util.Scanner;

public class Test10 {
    //键盘输入任意字符串，打乱里面的内容
    //1.键盘输入一个字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String str = sc.next();
        System.out.println(str);
        String result = randomstring(str);
        System.out.println(result);

    }
    public static String randomstring(String str){
        //将字符串转换为字符数组
        Random r =new Random();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char flag = arr[i];
            //随机数
            int index = r.nextInt(arr.length);
            arr[i] = arr[index];
            arr[index] = flag;
        }
        return new String(arr);
    }
}
