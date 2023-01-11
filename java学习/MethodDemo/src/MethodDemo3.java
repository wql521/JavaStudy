public class MethodDemo3 {
    //设计一个方法求数组最大值，并将最大值返回
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3,5,7,2,3};
        //2.调用方法求最大值
        int max = maxDemo(arr);
        System.out.println(max);
    }
    public static int maxDemo(int[] arr){
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }

}
