import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2.创建学生对象
        Student stu1 = new Student("zhangsan",19);
        Student stu2 = new Student("lisi",18);
        Student stu3 = new Student("wangsu",16);
        //3.向集合添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            //i索引list.get(i) 元素/学生对象
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
