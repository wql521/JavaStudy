public class Test {
    public static void main(String[] args) {
        Outer.Inner o = new Outer().new Inner();
        o.method();

        Outer outer =new Outer();
        outer.getInstance().method();

        outer.getInstance().show();

    }
}
