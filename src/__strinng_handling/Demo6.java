package __strinng_handling;

public class Demo6 {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hi! Welcome to the family");
        StringBuilder str1=new StringBuilder("Hi! Welcome to the family");
        System.out.println(str.equals(str1));
        String str2="Hi! Welcome to the family";
        String str3="Hi! welcome to the Family";
        System.out.println(str2.equalsIgnoreCase(str3));

    }
}
