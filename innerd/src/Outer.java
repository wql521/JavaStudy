public class Outer {
    String name;
    private int a = 10;

    class Inner{
        private int a = 20;
        public void method(){
            String age;
            System.out.println("内部类方法 --method");
        }
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(new Outer().a);
            System.out.println(Outer.this.a);
        }
    }

    public Inner getInstance(){
        return new Inner();
    }
}
