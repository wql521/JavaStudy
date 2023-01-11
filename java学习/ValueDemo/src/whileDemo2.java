public class whileDemo2 {
    public static void main(String[] args) {
        //珠穆朗玛峰（8844.43米=8844430毫米),假如有一张足够大的纸，它的厚度是0.1毫米，需要折叠多少次可以达到珠穆朗玛峰的高度
        //定义一个变量记录次数
        int count = 0;
        //记录开始厚度
        double i = 0.1;
        //记录山峰高度
        double heigth = 8844430;
        while (i <= heigth){
            count++;
            //折叠纸张
            i *= 2;
            System.out.println(i);
        }
        System.out.println("折叠次数："+count);
    }
}
