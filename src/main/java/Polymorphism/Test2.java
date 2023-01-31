package Polymorphism;

public class Test2 {
    /*
    * 根据需求完成代码:
	1.定义狗类
		属性：
			年龄，颜色
		行为:
			eat(String something)(something表示吃的东西)
			看家lookHome方法(无参数)

	2.定义猫类
		属性：
			年龄，颜色
		行为:
			eat(String something)方法(something表示吃的东西)
			逮老鼠catchMouse方法(无参数)

	3.定义Person类//饲养员
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法
	4.定义测试类(完成以下打印效果):
		keepPet(Dog dog,String somethind)方法打印内容如下：
			年龄为30岁的老王养了一只黑颜色的2岁的狗
			2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
		keepPet(Cat cat,String somethind)方法打印内容如下：
			年龄为25岁的老李养了一只灰颜色的3岁的猫
			3岁的灰颜色的猫眯着眼睛侧着头吃鱼
    * */
    public static void main(String[] args) {
        Persons person = new Persons("老王", 30);
        Dogs dogs = new Dogs(2, "黑");
        person.keepPet(dogs, "骨头");

        Persons persons2 = new Persons("老王", 25);
        Cats cats = new Cats(3, "灰");
        persons2.keepPet(cats, "鱼");
    }
}

class Animals {
    //属性：
    //			年龄，颜色
    //		行为:
    //			eat(String something)(something表示吃的东西)
    private int age;
    private String color;

    public Animals() {
    }

    public Animals(int age, String color) {
        this.age = age;
        this.color = color;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something) {
        System.out.println("动作在吃" + something);
    }
}

class Dogs extends Animals {
    //1.定义狗类
    //		属性：
    //			年龄，颜色
    //		行为:
    //			eat(String something)(something表示吃的东西)
    //			看家lookHome方法(无参数)
    public Dogs() {
    }

    public Dogs(int age, String color) {
        super(age, color);
    }

    //行为
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}

class Cats extends Animals {
    public Cats() {
    }

    public Cats(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Persons {
    //定义Person类//饲养员
    //		属性：
    //			姓名，年龄
    //		行为：
    //			keepPet(Dog dog,String something)方法
    //				功能：喂养宠物狗，something表示喂养的东西
    //		行为：
    //			keepPet(Cat cat,String something)方法
    //				功能：喂养宠物猫，something表示喂养的东西
    //		生成空参有参构造，set和get方法
    private String name;
    private int age;

    public Persons() {
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animals animals, String something) {
        String an = "";
        if (animals instanceof Dogs) {
            an = "狗";
        } else if (animals instanceof Cats) {
            an = "猫";
        }
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animals.getColor() + "颜色的" + animals.getAge() + "岁的" + an);
        animals.eat(something);
    }
}

