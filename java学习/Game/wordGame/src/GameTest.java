public class GameTest {
    public static void main(String[] args) {
        //1.创建第一个角色
        Role r1 = new Role("古一法师",100,'男');
        //2.创建第二个角色
        Role r2 = new Role("无心法师",100,'女');

        //打印信息
        r1.messages();
        r2.messages();

        while (true){
            //r1开始攻击r2
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+"ko了"+r2.getName());
                break;
            }
            //r2开始攻击r1
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+"ko了"+r1.getName());
                break;
            }
        }
    }
}
