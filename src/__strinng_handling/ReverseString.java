package __strinng_handling;

import __oops.functional_interaface.Sum;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("NAVIN");
        StringBuilder str1=new StringBuilder("ANIL");
        StringBuilder str2=new StringBuilder("BHARATI");
        StringBuilder str3=new StringBuilder("VINIT");
//        System.out.println(str.reverse());
//        System.out.println(str1.reverse());
        System.out.println(str2.reverse());
        System.out.println(str3.reverse());
        System.out.println(str.compareTo(str1));
        System.out.println(str.insert(0,"Bh"));
        System.out.println(str1.substring(0,3));
    }
}
