package __strinng_handling;

public class Demo5 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hi! Welcome to the family");
        System.out.println(str.substring(0,11));
        System.out.println(str.indexOf("f"));
        System.out.println(str.replace(19,str.length(),"world"));

    }
}
