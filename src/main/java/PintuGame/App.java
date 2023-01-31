package PintuGame;

import cczu.ui.GameJFrame;
import cczu.ui.LoginJFrame;
import cczu.ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        //程序的启动入口

        //游戏界面
        new GameJFrame();

        //登陆界面
        new LoginJFrame();
        //注册界面
        new RegisterJFrame();
    }
}
