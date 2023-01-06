public class test1 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}
class Fu{
    String name = "fu";
}

class Zi extends Fu{
    String name = "zi";
    public void show(){
        String name ="zishow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}