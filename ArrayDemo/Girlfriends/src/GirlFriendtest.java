public class GirlFriendtest {
    /*定义数组存储4个女朋友的对象
    * 女朋友的属性：姓名，年龄，性别，爱好
    * 要求1：计算出四女朋友的平均年龄
    * 要求2：统计年龄比平均值低的女朋友有几个，并把她们的所有信息打印出来*/
    public static void main(String[] args) {
        //1.定义数组存入女朋友的对象
        GirlFriend[] arr =new GirlFriend[4];
        //2.创建4个女朋友的对象
        GirlFriend gr1 = new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gr2 = new GirlFriend("小丹丹",20,"萌妹子","打游戏");
        GirlFriend gr3 = new GirlFriend("小慧慧",24,"萌妹子","学习");
        GirlFriend gr4 = new GirlFriend("小新新",21,"萌妹子","睡觉");
        //3.把对象添加到数组中
        arr[0] = gr1;
        arr[1] = gr2;
        arr[2] = gr3;
        arr[3] = gr4;
        //4.求和
        int sumAge = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlfriend = arr[i];
            sumAge += girlfriend.getAge();
        }
        //5.平均
        int avg = sumAge/arr.length;
        //6.统计
        int count = 0;
        System.out.println("四个女朋友的平均年龄："+avg);
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            if (girlFriend.getAge() < avg){
                count ++;
                System.out.println(girlFriend.getName()+","+girlFriend.getAge()+","+girlFriend.getGender()+","+girlFriend.getHobby());
            }
        }
        System.out.println("年龄比平均值低的女朋友有"+count+"个");
    }
}
