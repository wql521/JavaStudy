package Polymorphism;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        Student student = new Student();
        student.setName("张三");
        student.setAge(23);

        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(24);

        Administrator administrator = new Administrator();
        administrator.setName("管理员");
        administrator.setAge(25);

        //调用方法
        register(student);
        register(teacher);
        register(administrator);
    }

    //这个方法既能接收老师，又能接收学生和管理员
    //参数写成这三个类的父类
    public static void register(Person P) {
        P.show();
    }
}
