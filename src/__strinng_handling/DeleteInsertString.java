package __strinng_handling;

public class DeleteInsertString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("NAVIN");
        System.out.println(str.indexOf("N"));
        System.out.println(str.deleteCharAt(0));
//        System.out.println(str.delete(0,1));
        System.out.println(str.insert(0,"BH"));
    }
}
