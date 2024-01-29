package sealed;

public sealed class Parent permits ChildA, ChildB {
    public static String getNumber(){
        try {
            int divide=10/0;
            return "valid expression"+divide;
        }catch (Exception exception){
            return "catch block";
        }finally {
            return "finally block";
        }
    }
    public static void main(String[] args) {
        System.out.println(getNumber());
    }
}
