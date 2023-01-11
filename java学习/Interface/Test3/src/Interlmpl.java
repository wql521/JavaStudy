public class Interlmpl implements Infer{
    @Override
    public void method(){
        System.out.println("实现类中的重写的抽象方法");
    }
    public static void show1(){
        System.out.println("实现类中的静态方法 --show1");
    }
}
