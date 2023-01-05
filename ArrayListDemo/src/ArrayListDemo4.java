import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {
    /*
    * 需求：

      1，main方法中定义一个集合，存入三个用户对象。

         用户属性为：id，username，password

      2，要求：定义一个方法，根据id查找对应的学生信息。

         如果存在，返回索引

         如果不存在，返回-1
    * */
    public static void main(String[] args) {
        //1.定义一个集合
        ArrayList<User> list = new ArrayList<>();
        //2.创建用户对象
        User us1 = new User("wql","Wangqianlong",123);
        User us2 = new User("hx","hanxin",456);
        User us3 = new User("xz","xingzhen",789);
        //3.向集合中存储对象
        list.add(us1);
        list.add(us2);
        list.add(us3);
        //4.键盘输入查询id
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入id：");
        String id = sc.next();
        int result = checkid(list,id);
        System.out.print("查询结果:"+result);


    }
    //4.定义方法，通过id查找对应学生信息
    public static int checkid(ArrayList<User> list,String id){
        //遍历获取每个id
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i); //获取集合每一个元素
            if (user.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
