import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //2.添加数据
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("eee");
        System.out.println("---增---");
        System.out.println(list); //[aaa, bbb, ccc, eee]
        //2.删除数据
        System.out.println("---删---");
        boolean result = list.remove("ccc");
        System.out.println(result); //true
        System.out.println(list); //[aaa, bbb, eee]
        boolean result1 = list.remove("ddd");
        System.out.println(result1); //false
        System.out.println(list);// [aaa, bbb, eee]
        String result2 = list.remove(1);
        System.out.println(result2); //bbb
        System.out.println(list); //[aaa, eee]
        //3.修改数据
        System.out.println("---改---");
        list.set(0,"我喜欢你");
        System.out.println(list);// [我喜欢你, eee]
        //4.查找数据
        String result3 = list.get(0);
        System.out.println(result3); //我喜欢你
        //5.集合长度
        int result4 = list.size();
        System.out.println(result4); //2
    }
}
