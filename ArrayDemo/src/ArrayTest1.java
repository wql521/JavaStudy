public class ArrayTest1 {
    public static void main(String[] args) {
        /*求最值
        * 已知数组元素为[33，5，22，44，55]
        * 求出数组中最大值并且打印在控制台*/
        //1.定义一个数组
        int[] arr = {33,5,22,44,55};
        //4.定义一个动态变量
        int result = 0;
        //2.for循环遍历数组每一个元素
        for (int i = 0;i < arr.length;i++){
            //3.对每一个元素进行判断
            if (arr[i] > result){
                result =arr[i];
            }
        }
        System.out.println(result);
    }
}
