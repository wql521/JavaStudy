public class MethodTest1 {
    //定义一个方法判断数组中的某一个数是否存在，并将结果返回给调用处
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3,4,5,6};
        //2.调用方法判断
        boolean result = contains(arr,10);
        System.out.println(result);
    }
    public static boolean contains(int[] arr,int number){
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
