public class ArrayDemo3 {
    public static void main(String[] args) {
        /*定义一个数组，用来存储班级中50个学生的姓名
        * 姓名未知，等学生报道之后，再进行添加*/
        //格式：
        //数据类型[] 数组名 = new 数据类型[数组长度]
        //在创建的时候，由我们自己指定数组长度，由虚拟机给出默认的初始化值

        String[] arr = new String[50];
        //添加学生
        arr[0] = "Lisi";
        arr[1] = "Zhangsan";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); //打印出来的是默认初始化值null
    }
}
