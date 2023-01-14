import java.util.ArrayList;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        //键盘录入一些1～100之间的整数，并添加到集合之中
        //直到集合中所有数据和超过200为止

        //创建一个集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        //while循环包裹键盘录入
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("请输入1～100之间的整数:");
            int i = scanner.nextInt();
            if (i <1 || i>100){
                System.out.println("当前数字不在1~100的范围当中，请重新输入");
                continue;
            }
            arrayList.add(i);
        } while (sum(arrayList));
        System.out.println(arrayList);
    }
    public static boolean sum(ArrayList<Integer> arrayList){
        int SUM = 0;
        for (Integer integer : arrayList) {
            SUM += integer;
        }
        return SUM <= 200;
    }
}
