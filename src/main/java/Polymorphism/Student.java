package Polymorphism;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生信息" + getName() + "," + getAge());
    }
}
