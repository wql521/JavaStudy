public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,56,9};
        String st = ArrayUtil.printArr(arr);
        System.out.println(st);

        double[] arr1 = {1.2,1.0,23.2};
        double result = ArrayUtil.getAerage(arr1);
        System.out.println(result);
    }
}
