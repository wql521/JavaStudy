package PintuGame.cczu.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //JFrame 界面，窗体
    //规定：GameJFrame这个界面表示的是游戏的主界面

    //创建一个二维数组
    //用来管理数据，规定图片顺序
    int[][] data = new int[4][4];
    //定义一个正确的数组
    int[][] win = new int[][]{
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0}
    };
    //定义一个变量展示当前图片路径
    String path = "image/qx/";


    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem autorItem = new JMenuItem("尘世烟雨客");

    //记步器
    int count = 0;

    //记录空白方块的位置
    int x = 0;
    int y = 0;
    public GameJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();

        //初始化图片
        initImage();

        setFocusable(true);
        //设置显示出来（最后）
        setVisible(true);
    }
    //初始化数据
    private void initData(){
        //1.打乱一个一纬数组
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2.打乱数组中数组的顺序
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            //交换
            tempArr[i] = tempArr[index];
            tempArr[index] =temp;
        }
        /*
        //3.遍历数组
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i]+" ");
        }
        System.out.println();
         */
        //给二维数组添加数据
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0){
                x = i/4;
                y = i%4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    private void initImage() {
        //清空所有已经存在的图片
        getContentPane().removeAll();
        if (victory()){
            //显示胜利的图标
            JLabel winjalabel = new JLabel(new ImageIcon("image/win.png"));
            winjalabel.setBounds(203,283,197,73);
            getContentPane().add(winjalabel);
        }

        JLabel setCount = new JLabel("步数："+count);
        setCount.setBounds(50,30,100,20);
        getContentPane().add(setCount);

        for (int j = 0 ;j < 4 ;j++){
            for (int i = 0;i < 4; i++){
                //获取当前要加载图片的序号
                int number = data[j][i];
                //创建一个图片ImageIcon对象
                ImageIcon icon = new ImageIcon(path+number+".jpg");
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定位置
                jLabel.setBounds(105 * i + 83,105 * j +134,105,105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                //add(jLabel);
                getContentPane().add(jLabel);
                //添加一次之后number需要自增，表示下一次加载后面一张图片
            }
        }

        //添加背景图片
        ImageIcon background = new ImageIcon("image/background.png");
        JLabel jLabel1 = new JLabel(background);
        jLabel1.setBounds(40,40,508,560);
        //把背景图片添加到界面
        getContentPane().add(jLabel1);

        //刷新一下界面
        getContentPane().repaint();
    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象（功能 作者）
        JMenu functionJMenu = new JMenu("功能");
        JMenu autorJMenu = new JMenu("作者");

        //将每一个选项下面的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        autorJMenu.add(autorItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(autorJMenu);

        //将整个界面设置菜单
        setJMenuBar(jMenuBar);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        autorItem.addActionListener(this);
    }

    private void initJFrame() {
        //设置界面的宽高
        setSize(603,680);
        //设置界面的标题
        setTitle("拼图单机版");
        //设置界面指定
        setAlwaysOnTop(true);
        //设置界面居中
        setLocationRelativeTo(null);
        //设置关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中位置，只有取消了才会按照xy轴的形式添加组件
        setLayout(null);
        //给整个屏幕添加键盘监听事件
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松的时候调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65){
            System.out.println("显示完整图片");
            //把界面中所有图片全部删除
            getContentPane().removeAll();
            //记载完整图片
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            getContentPane().add(all);
            //添加背景图片
            ImageIcon background = new ImageIcon("image/background.png");
            JLabel jLabel1 = new JLabel(background);
            jLabel1.setBounds(40,40,508,560);
            //把背景图片添加到界面
            getContentPane().add(jLabel1);

            getContentPane().repaint();
        }
    }

    //松开按键触发
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，胜利则直接结束
        if (victory()){
            //结束方法
            return;
        }
        //对上下左右进行判断
        //左37，上：38；右39；下40
        int code = e.getKeyCode();
        switch (code){
            case 37 -> {
                if (y != 3){
                    System.out.println("向左移动");
                    //每一个方块用一个数字表示，空白方块用0表示
                    //x,y表示空白方块；
                    //x,y+1表示空白方块右边的方块
                    data[x][y] = data[x][y+1];
                    data[x][y+1] = 0;
                    y++;
                    count++;
                    //调用方法按照最新的数字加载图片
                    initImage();
                }else{
                    System.out.println("空白方块在最右边");
                }
            }
            case 38 -> {
                if (x != 3){
                    System.out.println("向上移动");
                    //x,y表示空白方块
                    //x+1,y表示空白方块下面的方块
                    data[x][y] = data[x+1][y];
                    data[x+1][y] = 0;
                    x++;
                    count++;
                    //调用方法按照最新的数字加载图片
                    initImage();
                }else {
                    System.out.println("空白方块在最下面");
                }
            }
            case 39 -> {
                if (y != 0){
                    System.out.println("向右移动");
                    //每一个方块用一个数字表示，空白方块用0表示
                    //x,y表示空白方块；
                    //x,y-1表示空白方块左边的方块
                    data[x][y] = data[x][y-1];
                    data[x][y-1] = 0;
                    y--;
                    count++;
                    //调用方法按照最新的数字加载图片
                    initImage();
                }else {
                    System.out.println("空白方块在最左边");
                }
            }
            case 40 -> {
                if (x != 0){
                    System.out.println("向下移动");
                    //x,y表示空白方块
                    //x-1,y表示空白方块上面的方块
                    data[x][y] = data[x-1][y];
                    data[x-1][y] = 0;
                    x--;
                    count++;
                    //调用方法按照最新的数字加载图片
                    initImage();
                }else {
                    System.out.println("空白方块在最上面");
                }
            }
            case 65 -> initImage(); //a //显示完整图片
            case 87 -> { //w //作弊按键
                data = new int[][]{
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}
                };
                initImage();
            }
        }
    }

    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        //判断
        if (obj == replayItem){
            System.out.println("重新游戏");
            //再次打乱二维数组中的数据
            initData();
            //计数器清零
            count = 0;
            //重新加载图片
            initImage();

        }else if (obj == reLoginItem ){
            System.out.println("重新登录");
            //关闭当前界面
            setVisible(false);
            //打开登录界面
            new PintuGame.cczu.ui.LoginJFrame();
        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        } else if (obj == autorItem) {
            System.out.println("显示作者");
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理容器
            JLabel jLabel = new JLabel("尘世烟雨客");
            //设置位置和宽高
            jLabel.setBounds(0,0,40,45);
            //加到弹框中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(40,45);
            //弹框置顶
            jDialog.setAlwaysOnTop(true);
            //弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭，无法操作其他界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }
    }
}
