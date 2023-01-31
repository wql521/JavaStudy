package RuntimeAPI;

import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        //获取Runtime的对象
        //Runtime runtime = Runtime.getRuntime();

        //exit 停止虚拟机
        //Runtime.getRuntime().exit(0);

        //获取CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //获取总内存大小，单位byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);//两个1024，目前单位mb

        //运行cmd命令
        //Runtime.getRuntime().exec("");
    }
}
