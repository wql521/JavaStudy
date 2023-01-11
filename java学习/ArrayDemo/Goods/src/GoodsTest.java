public class GoodsTest {
    /*定义数组存储3个商品对象
    * 商品的属性： 商品的id，名字，价格，库存
    * 创建三个商品对象，并把商品对象存入到数组当中*/
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];
        //2.创建三个商品对象
        Goods g1 =new Goods("001","华为",5999.0,100);
        Goods g2 =new Goods("001","小米",8889.0,80);
        Goods g3 =new Goods("001","苹果",9999.0,50);
        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //4.遍历
        for (Goods goods : arr) {
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }
    }
}
