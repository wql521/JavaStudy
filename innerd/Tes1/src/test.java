public class test {
    public static void main(String[] args) {
        Swim s = new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };
        s.swim();
        System.out.println(s.name);

    }
}
