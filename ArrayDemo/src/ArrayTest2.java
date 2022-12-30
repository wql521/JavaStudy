import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*生成10个1-100之间的随机数存入数组
        * 1.求出所有数据的和
        * 2.求所有数据的平均值
        * 3.统计有多少个数据比平均值小*/

        //1.创建一个动态初始化数组
        int[] arr = new int[10];
        //2.生成随机数并且导入
        Random sr = new Random();
        for (int i = 0; i <= 9; i++){
            arr[i] = sr.nextInt(100) + 1;
            System.out.println(arr[i]);
        }

        //3.求和
        int sum = 0;
        for (int x = 0;x < arr.length;x++){
            sum += arr[x];
        }
        System.out.println("所有数据的和:"+sum);

        //4.求平均值
        int avg = sum / arr.length;
        System.out.println("所有数据的平均值:"+avg);

        //5.统计有多少个数据比平均值小
        //计数器
        int count = 0;
        for (int y = 0;y < arr.length;y++){
            if (arr[y] < avg){
                count++;
            }
        }
        System.out.println("有"+count+"个数据比平均值小");

    }
}
