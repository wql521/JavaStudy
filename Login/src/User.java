public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //构造方法
    //空参
    public User(){}
    //带参
    public User(String username,String password,String email,String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    //set方法
    public void setUsername(String username){
        this.username = username;
    }
    //get方法
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

