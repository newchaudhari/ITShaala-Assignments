package __strinng_handling;

public class ReplaceString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("navin anil chaudhari");
        System.out.println(str.replace(0,5,"bharati"));
        String str1="navin anil chaudhari";
        System.out.println(str1.replace('n','b'));
    }
}