public class Variabletest{
    //主入口
    public static void main(String[] args){
        //一开始没有乘客
        int a = 0;
        //第一站:上去一名乘客
        a=a+1;
        //第二站:上去两名乘客,下来一名乘客
        a=a+2-1;
        //第三站:上去两名乘客,下来一名乘客
        a=a+2-1;
        //第四站:下来一名乘客
        a=a-1;
        //第五站:上去一名乘客
        a=a+1;
        //请问:终点站,车上还有几名乘客?
        System.out.println(a);
    }
}
