package __blocks_NestedClass;

public class Demo1 {
    int id;
    String companyName;
    int price;
    static String type;

    public Demo1() {
    }

    public Demo1(int id, String name, int price) {
        this.id = id;
        this.companyName = name;
        this.price = price;
    }
    static {
        Demo1.type="Electronics item";
        System.out.println(Demo1.type);
        System.out.println();
    }
//    {
//        System.out.println("\t Laptop");
//    }
    void setPrice(int price){
        this.price=price;
    }
    int getPrice(){
        return price;
    }

    public static void main(String[] args) {

        Demo1 p1=new Demo1(1,"Dell",50000);
        System.out.println(+p1.id+"\t"+p1.companyName+"\t"+p1.price);

        Demo1 p2=new Demo1(2,"Lenovo",55000);
        p2.setPrice(75000);
        p2.getPrice();
        System.out.println(+p2.id+"\t"+p2.companyName+"\t"+p2.price);

        Demo1 p3=new Demo1(3,"Mac",150000);
        System.out.println(+p3.id+"\t"+p3.companyName+"\t\t"+p3.price);
    }

}
