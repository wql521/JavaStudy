import java.util.ArrayList;

public class ArrayListDemo1 {
    //定义一个集合,添加字符串,并进行遍历,遍历格式参照: [元素1,元素2,元素3]
    public static void main(String[] args) {
        //1.定义一个集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加元素
        list.add("你好");
        list.add("我喜欢你");
        list.add("就是你");

        //3.遍历元素
        String result = "[";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1){
                result = result + list.get(i) + "]";
            }else {
                result = result + list.get(i) + ",";
            }
        }

        //4.打印
        System.out.println(result);
    }
}
