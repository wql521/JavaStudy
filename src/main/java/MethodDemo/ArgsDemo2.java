package MethodDemo;

public class ArgsDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("调用change方法前:" + arr[1]);
        change(arr);
        System.out.println("调用change方法后:" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
