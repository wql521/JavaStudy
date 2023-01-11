package cczu.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册界面

    public RegisterJFrame(){
        //设置界面的宽高
        setSize(603,680);
        //设置界面的标题
        setTitle("注册");
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
