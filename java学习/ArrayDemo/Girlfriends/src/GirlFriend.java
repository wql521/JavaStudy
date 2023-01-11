public class GirlFriend {
    //女朋友属性：姓名，年龄，性别，爱好
    private  String name;
    private  int age;
    private String gender;
    private String hobby;

    public GirlFriend(){}
    public GirlFriend(String name,int age,String gender,String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }
}
