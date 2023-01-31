package ValueDemo;

public class test4 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;//先把a变量的值拿出来用,赋值给b,然后再进行自增
        System.out.println(a);//11
        System.out.println(b);//10
        int c = 10;
        int d = ++c;//先把a进行自增,然后再把自增后的结果赋值给b变量
        System.out.println(c);//11
        System.out.println(d);//11

    }
}
