package __methods_practice;

public class ToStringDemo {
    int productID;
    String productName;

    @Override
    public String toString() {
        return "productID=" + productID +
                ", productName='" + productName + '\'';
    }

    public ToStringDemo(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public static void main(String[] args) {
        ToStringDemo t1=new ToStringDemo(1,"Laptop");
        System.out.println(t1.toString());
    }
}
