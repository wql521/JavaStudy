import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        /*直播抽奖，奖品是现金红包，分别有[2，588，888，1000，10000]五个奖金，请使用代码模拟抽奖，打印出每个选项
        * 奖项的出现顺序要随机且不重复*/

        //1.定义数组表示奖池
        int[] arr = {2,588,888,1000,10000};
        //2.定义新数组用于存储奖池的结果
        int [] newArr = new int[arr.length];
        //3.抽奖
        Random r = new Random();
        //因为有5个奖项，循环5次
        for (int i = 0; i < 5;) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomIndex];
            //判断当前的奖项是否存在，如果存在则重新抽取，不存在，就表示有效奖项
            if (!contains(newArr,prize)){
                //把当前抽取到的奖项添加到newArr当中
                newArr[i] = prize;
                //添加完毕移动索引
                i++;
            }
        }
        for (int j : newArr) {
            System.out.println(j);
        }
    }
    //判断prize在数组是否存在
    //存在：true
    //不存在： false
    public static boolean contains(int[] arr,int prize){
        for (int j : arr) {
            if (j == prize) {
                return true;
            }
        }
        return false;
    }
}
