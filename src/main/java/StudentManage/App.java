package StudentManage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("---------欢迎来到学生管理系统升级版---------");
            System.out.println("请选择操作：1登陆，2注册，3忘记密码");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入选择:");
            String choose = sc.next();
            switch (choose) {
                case "1" -> Login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见！");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //登陆
    public static void Login(ArrayList<User> list) {
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.print("请输入用户名:");
            String username = sc.next();
            int checkIndex = checkIndex(list, username);
            if (checkIndex == -1) {
                System.out.println("用户名" + username + "没有注册，请先注册再登陆");
                return;
            }
            //2.键盘输入密码
            System.out.println("请输入密码:");
            String password = sc.next();
            //3.键盘输入验证码
            String rightCode = GetCode();
            System.out.println("当前正确验证码:" + rightCode);
            while (true) {
                System.out.print("请输入验证码:");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入");
                }
            }
            //验证用户名和密码是否正确
            //将上面输入的数据封装为一个对象
            User InfoUser = new User(username, password, null, null);
            boolean Result = checkInfo(list, InfoUser);
            if (Result) {
                System.out.println("登陆成功");
                //创建对象，调用方法，启动学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.StartStudentSystem();
                break;
            } else {
                System.out.println("登陆失败,用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前账号" + username + "被锁定");
                    return;
                } else {
                    System.out.println("用户名或密码错误，还剩" + (2 - i) + "次");
                }
            }
        }
    }

    //注册
    public static void register(ArrayList<User> list) {
        //1.键盘录入用于名
        //用户名需要满足以下要求：
        //验证要求：
        //先验证格式是否正确，再验证是否唯一
        //用户名长度必须在3~15位之间
        //只能是字母加数字的组合，但是不能是纯数字
        //用户名唯一
        Scanner sc = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("请输入用户名:");
            name = sc.next();
            boolean result = checkUsernmae(name);
            if (!result) {
                System.out.println("用户名格式不满足条件，请重新输入!");
                continue;
            }
            //判断用户名是否唯一
            int resultIndex = checkIndex(list, name);
            if (resultIndex >= 0) {
                //用户名存在
                System.out.println("用户名" + name + "存在" + "，请重新输入。");
            } else {
                //用户名不存在，可以继续录入
                System.out.println("用户名" + name + "可以使用。");
                break;
            }
        }
        //2.键盘输入密码
        //密码键盘输入两次，两次一致才可以进行注册。
        String password;
        while (true) {
            System.out.print("请输入要注册的密码:");
            password = sc.next();
            System.out.print("请再次输入要注册的密码:");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码输入不一致，请重新输入！");
            } else {
                System.out.println("两次密码输入一致，继续录入其他数据");
                break;
            }
        }
        //3.键盘输入身份证号
        //验证要求：
        //长度为18位
        //不能以0为开头
        //前17位，必须都是数字
        //最为一位可以是数字，也可以是大写X或小写x
        String personId;
        while (true) {
            System.out.print("请输入身份证号:");
            personId = sc.next();
            boolean result = checkpersonID(personId);
            if (!result) {
                System.out.println("身份证格式不正确，请重新输入!");
            } else {
                System.out.println("身份证格式正确，请继续输入其他信息");
                break;
            }
        }
        //4.键盘输入手机号码
        //验证要求：
        //长度为11位
        //不能以0为开头
        //必须都是数字
        String userPhone;
        while (true) {
            System.out.print("请输入注册手机号:");
            userPhone = sc.next();
            boolean resultnumber = checkPhoneNumber(userPhone);
            if (!resultnumber) {
                System.out.println("手机号格式错误，请重新输入");
            } else {
                System.out.println("手机号正确");
                break;
            }
        }
        //创建用户对象
        User user = new User(name, password, personId, userPhone);
        //把用户对象添加到集合中
        list.add(user);
        System.out.println("注册成功");
        pringList(list);
    }

    //打印集合的学生对象
    public static void pringList(ArrayList<User> list) {
        for (User user : list) {
            System.out.println(user.getUsername() + user.getPassword() + user.getPersonId() + user.getPhoneNumber());
        }
    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String name = sc.next();
        int Index = checkIndex(list, name);
        if (Index == -1) {
            System.out.println("用户不存在，请先注册");
            return;
        }
        //键盘录入身份证号和手机号码
        System.out.print("请输入身份证号:");
        String personID = sc.next();
        System.out.print("请输入手机号码:");
        String Phone = sc.next();
        //判断当前用户的身份证号码和手机号码是否一致，
        //封装用户的身份证号码和手机号码
        User InfoUser = new User(null, null, personID, Phone);
        boolean result = CheckInfo(list, InfoUser, Index);
        if (!result) {
            System.out.println("账号信息不匹配");
            return;
        }
        System.out.println("身份确认，可以修改密码");
        String newPassword;
        while (true) {
            System.out.print("请输入修改后的密码:");
            newPassword = sc.next();
            System.out.print("请再次输入密码:");
            String AgainNewPassword = sc.next();
            if (newPassword.equals(AgainNewPassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }
        }
        //修改数据
        changeDate(list, Index, newPassword);


    }

    //判断用户名格式
    public static boolean checkUsernmae(String username) {
        //将字符串变为字符数组
        char[] arr = username.toCharArray();
        //计数器
        int small = 0;
        int big = 0;
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 'z' && arr[i] >= 'a') {
                small++;
            } else if (arr[i] <= 'Z' && arr[i] >= 'A') {
                big++;
            } else if (arr[i] <= '9' && arr[i] >= '0') {
                number++;
            }
        }
        //用户名长度必须在3~15位之间
        //只能是字母加数字的组合，但是不能是纯数字
        if ((small + big + number) >= 3 && (small + big + number) <= 15) {
            if (small > 0 || big > 0) {
                return number != 0;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //判断用户名是否唯一
    public static int checkIndex(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(name)) {
                return i;
            }
        }
        //不存在,唯一
        return -1;
    }

    //判断身份证号码
    public static boolean checkpersonID(String personId) {
        //长度为18位
        if (personId.length() != 18) {
            return false;
        }
        //不能以0为开头
        if (personId.startsWith("0")) {
            return false;
        }
        //前17位，必须都是数字
        for (int i = 0; i < personId.length(); i++) {
            char c = personId.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //最为一位可以是数字，也可以是大写X或小写x
        char endChar = personId.charAt(personId.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'X') || (endChar == 'x')) {
            return true;
        } else {
            return false;
        }
    }

    //判断手机号码
    public static boolean checkPhoneNumber(String phonenumber) {
        //验证要求：
        //长度为11位
        if (phonenumber.length() != 11) {
            return false;
        }
        //不能以0为开头
        if (phonenumber.startsWith("0")) {
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phonenumber.length(); i++) {
            char c = phonenumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //生成一个验证码
    //长度为5
    //由4位大写或者小写字母和1位数字组成，同一个字母可重复
    //数字可以出现在任意位置
    private static String GetCode() {
        //1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //2.随机抽取4个字符
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字符
            sb.append(list.get(index));
        }
        //3.把一个随机数字放到末尾
        int number = r.nextInt(10);
        sb.append(number);

        //4.把字符串变成字符数组，在数组中修改，然后再穿件一个新的字符串
        char[] arr = sb.toString().toCharArray();
        //拿着最后一个索引，跟随机索引交换
        int Index = r.nextInt(arr.length);
        //交换索引指向的元素交换
        char temp = arr[Index];
        arr[Index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        //重新变为字符串并且返回
        return new String(arr);
    }

    //校验用户名和密码
    public static boolean checkInfo(ArrayList<User> list, User InfoUser) {
        //遍历集合，判断用户名是否存在
        int Index = checkIndex(list, InfoUser.getUsername());
        if (Index == -1) {
            //用户名不存在
            return false;
        } else {
            User user = list.get(Index);
            return InfoUser.getPassword().equals(user.getPassword());
        }
    }

    //校验用户的身份证号码和手机号码
    public static boolean CheckInfo(ArrayList<User> list, User InfoUser, int index) {
        User user = list.get(index);
        if (user.getPersonId().equals(InfoUser.getPersonId())) {
            return user.getPhoneNumber().equals(InfoUser.getPhoneNumber());
        } else {
            return false;
        }
    }

    //修改密码
    public static void changeDate(ArrayList<User> list, int index, String change) {
        User user = list.get(index);
        user.setPassword(change);
        System.out.println("修改数据成功");
    }
}
