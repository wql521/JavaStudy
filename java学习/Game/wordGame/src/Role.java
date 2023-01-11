import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"风流倜傥","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂"};
    String[] girlfaces = {"美轮美奂","沉鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋"};
    //攻击描述
    String[] attackdesc = {
            "%s使出了一招【背心钉】，转到对方身后，一掌像%s背心的灵台穴拍去",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s",
            "%s大喝一声，身形下伏，一招【雳雷坠地】，锤向%s双腿",
            "%s运气于掌，一瞬向掌心变得血红，一式【掌心雷】，推向%s",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s"
    };
    String[] inattackdesc = {
            "结果%s退了半步，毫发无伤",
            "结果给%s造成了一处瘀伤",
            "结果一击命中，%s痛的弯下腰",
            "结果%s痛苦的闷哼了一声，显然受了内伤",
            "结果%s一声惨叫，像瘫软泥般塌了下来",
    };


    public Role() {
    }

    public Role(String name,int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }
    //姓名等打印
    public void messages(){
        System.out.println("-----------------------");
        System.out.println("姓名："+getName());
        System.out.println("血量："+getBlood());
        System.out.println("性别："+getGender());
        System.out.println("长相："+getFace());
        System.out.println("-----------------------");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //思考：谁攻击谁？
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.R攻击(r2);
    //方法调用者去攻击参数
    public void attack(Role role){
        //随机攻击招式
        Random r= new Random();
        int index = r.nextInt(attackdesc.length);
        String KunFu =attackdesc[index];
        //输出攻击效果
        System.out.printf(KunFu,this.getName(),role.getName());
        System.out.println();

        //计算造成的伤害1～20
        int hurt = r.nextInt(20)+1;

        //剩余多少血量
        int remainBoold = role.getBlood()-hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        //修改一下挨揍的的人的血量
        role.setBlood(remainBoold);

        //受伤的描述
        //80-100 0索引描述
        //60-80 1索引描述
        //40-60 2索引描述
        //20-40 3索引描述
        //0-20 4索引描述
        if (remainBoold >= 80){
            System.out.printf(inattackdesc[0],role.getName());
        } else if (remainBoold >= 60) {
            System.out.printf(inattackdesc[1],role.getName());
        } else if (remainBoold >= 40) {
            System.out.printf(inattackdesc[2],role.getName());
        } else if (remainBoold >= 20) {
            System.out.printf(inattackdesc[3],role.getName());
        } else {
            System.out.printf(inattackdesc[4],role.getName());
        }
        System.out.println();
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        //长相随机
        if (gender == '男'){
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "面目狰狞";
        }
    }
}
