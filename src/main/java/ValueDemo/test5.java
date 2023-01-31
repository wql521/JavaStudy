package ValueDemo;

public class test5 {
    public static void main(String[] args) {
        //兰州拉面、武汉热干面、北京炸酱面、陕西油泼面
        //1.定义变量,记录想要吃的面条
        String noodle = "兰州拉面";

        //2.将上面记录的变量利用switch语句进行匹配
        switch (noodle) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃泡面");
                break;
        }

    }
}
