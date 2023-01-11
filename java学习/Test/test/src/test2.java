public class test2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        //创建学生对象
        Student student = new Student("张三",23);
        System.out.println(student.name);
        System.out.println(student.age);
    }
}

class Person{
    String name;
    int age;
    public Person(){
        System.out.println("父类的无参构造");
    }
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
}

class Student extends Person{
    public Student(){
        //子类构造方法中隐藏的super()去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }
    public Student(String name,int age){
        super(name,age);
    }
}