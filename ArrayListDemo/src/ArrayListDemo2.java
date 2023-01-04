import java.util.ArrayList;

public class ArrayListDemo2 {
    //定义一个集合,并添加数字,并进行遍历,遍历格式参照: [元素1,元素2,元素3]
    public static void main(String[] args) {
        //1.定义一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加元素
        list.add(5);
        list.add(2);
        list.add(1);

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
