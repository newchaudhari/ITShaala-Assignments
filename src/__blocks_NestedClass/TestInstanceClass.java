package __blocks_NestedClass;

public class TestInstanceClass {
    public static void main(String[] args) {
        System.out.println("BankA");
        InstanceClass a=new InstanceClass();
       InstanceClass.bankA b=a.new bankA();
       b.m1();
        System.out.println();
        System.out.println("BankB");
       InstanceClass.bankB b1=a.new bankB();
       b1.m2();
    }
}
