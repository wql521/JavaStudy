public class Goods {
    private String id;
    private String name;
    private double price;
    private int count;

    public Goods(){}
    public Goods(String id,String name,double price,int count){
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    //id -set
    public void setId(String id){
        this.id = id;
    }
    //id -get
    public String getId(){
        return id;
    }
    //name -set
    public void setName(String name){
        this.name = name;
    }
    //name -get
    public String getName(){
        return name;
    }
    //price -set
    public void setPrice(double price){
        this.price = price;
    }
    //price -get
    public double getPrice(){
        return price;
    }
    //count -set
    public void setCount(int count){
        this.count = count;
    }
    //count -get
    public int getCount(){
        return count;
    }

}
