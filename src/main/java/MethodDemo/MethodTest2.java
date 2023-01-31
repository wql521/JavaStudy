package MethodDemo;

public class MethodTest2 {
    /*定义一个方法copyOfRange(int[] arr,int from,int to)
     * 将数组arr中从索引from（包含from）开始
     * 到索引to结束（不包含to）的元素复制到新数组中
     * 将新数组返回*/
    public static void main(String[] args) {
        //1.定义个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //2.调用方法
        int[] copyArr = copyOfRange(arr, 3, 6);
        for (int i : copyArr) {
            System.out.println(i);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        //1.定义新数组
        int[] newArr = new int[to - from];
        //2.拷贝到新数组
        //伪造索引
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        //3.返回
        return newArr;
    }
}
