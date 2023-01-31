package Polymorphism;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师信息" + getName() + "," + getAge());
    }
}
