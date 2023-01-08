public class Robbit extends Animal{
    public Robbit(){
    }
    public Robbit(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(getName()+"吃胡萝卜");
    }
}
