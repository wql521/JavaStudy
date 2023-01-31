package PintuGame.cczu.ui;

import javax.swing.*;

public class LoginJFrame  extends JFrame {
    //登陆界面

    public LoginJFrame(){
        //设置界面的宽高
        setSize(603,680);
        //设置界面的标题
        setTitle("登录");
        //设置界面指定
        setAlwaysOnTop(true);
        //设置界面居中
        setLocationRelativeTo(null);
        //设置关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //设置显示出来
        setVisible(false);
    }
}
