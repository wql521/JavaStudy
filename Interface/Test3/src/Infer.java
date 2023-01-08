public interface Infer {
    public abstract void method();
    public default void show(){
        System.out.println("接口中的默认方法 ---show");
    }
    public static void show1(){
        System.out.println("接口中的静态方法 ---show1");
    }
}
