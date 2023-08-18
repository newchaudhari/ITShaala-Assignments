package __strinng_handling;

public class Demo4 {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder();
        System.out.println(name.isEmpty());
        name.append("Navin Chaudhari");
        System.out.println(name.toString());
        System.out.println(name.length());
        System.out.println(name.replace(0,5,"Anil"));

    }
}
