package __oops.p1;

public class HashCode {
    private String name="abc";
    private String password="abc@123";


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {


        HashCode demo1=new HashCode();
        System.out.println("name "+demo1.name.hashCode());
        System.out.println("password "+demo1.password.hashCode());
//        System.out.println("demo1 "+demo1.hashCode());

        HashCode demo2=new HashCode();
//        System.out.println("demo2 "+demo2.hashCode());




    }

}
