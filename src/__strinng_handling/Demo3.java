package __strinng_handling;

public class Demo3 {
    public static void main(String[] args) {
        String name="";
        StringBuffer stringBuffer=new StringBuffer(name);
        stringBuffer.append("Anil Chaudhari");
        System.out.println(stringBuffer);
        stringBuffer.isEmpty();
        System.out.println(stringBuffer.isEmpty());
        System.out.println(stringBuffer);
    }
}
