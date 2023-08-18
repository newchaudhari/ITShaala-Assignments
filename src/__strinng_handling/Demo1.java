package __strinng_handling;

public class Demo1 {
    public static void main(String[] args) {
        char[] ch={'n','a','v','i','n'};
        String str=new String(ch);
        System.out.println(str);

        //String by using new keyword
        String str2=new String("Anil Chaudhari");

        //String by using literal way only used for String class
        String str1="Navin Chaudhari";

        System.out.println(str2);
        System.out.println(str1);

    }
}
