package __oops.inheritance.a1;

public class PQRTest extends R{
    int a=500;
    void m1(int a){
        System.out.println(a);//400
        System.out.println(this.a);//300
        System.out.println(super.a);//100
    }
    public static void main(String[] args) {
        PQRTest p=new PQRTest();
        p.m1(400);
    }
}
