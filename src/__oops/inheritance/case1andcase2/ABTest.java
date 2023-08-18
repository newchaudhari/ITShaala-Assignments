package __oops.inheritance.case1andcase2;

public class ABTest {
    public static void main(String[] args) {
        B b = new B();
        b.setUserId(15);
        b.setPass("navin@1234");
        System.out.println(b.getUserId());
        System.out.println(b.getPass());
    }
}
