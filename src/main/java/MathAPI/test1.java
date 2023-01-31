package MathAPI;

public class test1 {
    public static void main(String[] args) {
        //获取绝对值
        int a = -1;
        int b = Math.abs(a);
        System.out.println(b);

        //向上取整和向下取整
        double c = Math.floor(1.1);
        double d = Math.ceil(1.1);
        System.out.println(c + " " + d);

        //四舍五入
        double e = Math.round(1.3);
        double f = Math.round(1.5);
        System.out.println(e + " " + f);

        //获取最大值
        int g = Math.max(1, 2);
        System.out.println(g);

        //返回a的b次幂的值
        double h = Math.pow(2, 3);
        System.out.println(h);
        double k = Math.pow(4, 0.5);
        System.out.println(Math.sqrt(4));
        System.out.println(k);
        double l = Math.pow(2, -2);
        System.out.println(l);

        //返回为double的随机值,范围[0.0,1.0)
        double j = Math.random();
        System.out.println(j);

        System.out.println(Math.cbrt(8));
    }
}
