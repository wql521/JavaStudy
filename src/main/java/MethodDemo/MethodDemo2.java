package MethodDemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
    }

    /*设计一个方法用于遍历，要求遍历的结果是在一行上，例如：[11，22，33，44，55]*/
    public static void printArr(int[] arr) {
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println(']');

    }

}
