public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3,4};
        //利用循环遍历
        //开始条件：0
        //结束条件：数组长度 - 1 （最大索引）
        //在java中,关于数组的一个长度属性,length
        //调用方式:数组名.length
        for (int i = 0;i <= arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
