public class Administrator extends Person{
    @Override
    public void show(){
        System.out.println("管理员信息"+getName()+","+getAge());
    }
}
