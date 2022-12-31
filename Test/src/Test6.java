public class Test6 {
    public static void main(String[] args) {
        /*某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        * 规则如下：
        * 每位数加上5
        * 再对将所有数字反转
        * 得到一串新数
        * 按照以上规则进行解密
        * 比如1983加密之后变成8346，解密之后变成1983*/
        //1.定义数组记录解密之后的结果
        int[] arr = {8,3,4,6};
        int[] oldArr = decryptArr(arr);
        for (int i = 0; i < oldArr.length; i++) {
            System.out.println(oldArr[i]);
        }
    }
    public static int[] decryptArr(int[] arr){
        //1.反转
        for (int i = 0,j = arr.length-1;i < j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //2.由于加密是通过对10取余的方式进行获取的
        //经过加密过程1后最小值5，最大值14：5，6，7，8，9，10，11，12，13，14
        //对上面取余：5，6，7，8，9，0，1，2，3，4
        //所以在解密的时候就需要判断，0-4之间+10，5-9数字不变
        for (int i = 0;i < arr.length;i++){
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }
        }
        //3.每一位减5
        for (int i = 0;i < arr.length;i++){
            arr[i] = arr[i] - 5;
        }
        return arr;//返回
    }
}
