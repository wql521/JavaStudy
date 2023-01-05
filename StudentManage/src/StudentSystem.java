import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void StartStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) { //给循环起个标识符，让break跳出while循环
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.print("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop; //单个break只会跳出switc循环，break+标识符可以跳出指定循环
                    //System.exit(0); 停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("请输入学生id:");
            id = sc.next();
            int result = checkId(list,id);
            if (result >= 0){
                //表示存在，需要重新需入
                System.out.println("id已经存在，请重新录入");
            }else {
                //id不存在,表示可以继续使用
                break;
            }
        }
        System.out.print("请输入学生姓名:");
        String name = sc.next();
        System.out.print("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.print("请输入学生家庭住址:");
        String adress = sc.next();
        //创建学生对象
        Student student = new Student(id,name,age,adress);
        //向集合中添加学生对象
        list.add(student);
        System.out.println("添加成功");
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除学生的id:");
        String deleteId = sc.next();
        int result = checkId(list,deleteId);
        if (result >= 0){
            list.remove(result);
            System.out.println("删除成功");
        }else{
            System.out.println("没有要删除人的信息");
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改学生的id:");
        String updateId = sc.next();
        int resultindex = checkId(list,updateId);
        if (resultindex == -1){
            //表示修改人不在集合中
            System.out.println("要修改的id:"+updateId+"不存在，请重新输入");
            return;
        }
        //修改人在集合中
        //获取要修改的学生对象
        Student student = list.get(resultindex);
        //输入信息进行修改
        System.out.print("请输入修改后的学生姓名:");
        String newName = sc.next();
        student.setName(newName);
        System.out.print("请输入修改后的学生年龄:");
        int newAge = sc.nextInt();
        student.setAge(newAge);
        System.out.print("请输入修改后的学生家庭住址:");
        String newAdress = sc.next();
        student.setAdress(newAdress);
        System.out.println("修改成功");
    }
    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
            return; //结束本方法
        }
        //有学生信息，按照以下格式输出
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAdress());
        }
    }
    //通过id查询是否在集合中
    public static int checkId(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getId().equals(id)){
                return i;
            }
        }
        //不存在
        return -1;
    }
}
