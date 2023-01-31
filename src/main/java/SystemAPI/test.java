package SystemAPI;

public class test {
    public static void main(String[] args) {
        //终止虚拟机
        //System.exit(0);

        //获取事件
        long l = System.currentTimeMillis();
        System.out.println(l);

        //拷贝数组
        //public static void arraycopy(数据源数组,起始索引,目的地数组,起始索引,拷贝个数)
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 0, 10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + " ");
        }

        long l1 = System.currentTimeMillis();
        System.out.println("拷贝数组运行时间:" + (l1 - l));
    }
}
