package __oops.inheritance.case1andcase2;

public class A {
    private int userId;
    private String pass;

    public A() {
    }

    public A(int userId, String pass) {
        this.userId = userId;
        this.pass = pass;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
