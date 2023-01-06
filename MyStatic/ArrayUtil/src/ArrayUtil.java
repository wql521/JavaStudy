public class ArrayUtil {
    private ArrayUtil(){} //私有化构造方法 目的:不让外界创建他的对象
    //提供一个工具类方法printArr,用于放回整数数组的内容 ,返回的字符串格式如下[10,20,50] (只考虑整数数组,且只考虑一维数组)
    //需要定义为静态，方便调用
    public static String  printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    //提供一个工具类getAerage,用于返回平均分.(只考虑浮点型数组,且只考虑一维数组)
    public static double getAerage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
