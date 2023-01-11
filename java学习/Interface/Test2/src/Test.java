public class Test {
    /*我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练
    * 为了出国教练，跟乒乓球相关的人员都需要学习英语
    *
    * 乒乓球运动员 ： 姓名，年龄，学打乒乓球，说英语
    * 篮球运动员 ： 姓名，年龄，学打篮球
    * 乒乓球教练 ： 姓名，年龄，教打乒乓球，说英语
    * 篮球教练 ： 姓名，年龄，教打篮球*/
    public static void main(String[] args) {
        PingpangSporter pingpangSporter = new PingpangSporter("刘诗雯",23);
        pingpangSporter.speakEnglish();
        pingpangSporter.study();
        String  st = pingpangSporter.getName();
        System.out.println(st);
        int i = pingpangSporter.getAge();
        System.out.println(i);
    }

}
