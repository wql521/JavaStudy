public class ArrayTest3 {
    public static void main(String[] args) {
        /*定义一个数组，存入1，2，3，4，5。按照要求交换索引对应的元素
        * 交换前：1，2，3，4，5
        * 交换后：5，4，3，2，1*/

        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //2.利用循环去交换数据
        for (int i = 0,j = arr.length-1;i < j;i++,j--){
            //交换变量i和j指向的元素
            int temp = arr[i]; //中间变量
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
