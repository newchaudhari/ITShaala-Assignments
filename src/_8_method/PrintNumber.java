package _8_method;

public class PrintNumber {
    //Create a class named 'PrintNumber' to print various numbers of different datatypes
    // by creating different methods with the same name 'printn' having a parameter for each datatype.
    static int printn(int n){
        return n;
    }
   static byte printn(byte b){
        return b;
    }
    static short printn(short s){
        return s;
    }
   static char printn(char c){
        return c;
    }
    static float printn(float f){
        return f;
    }
    static double printn(double d){
        return d;
    }
    static long printn(long l){
        return l;
    }
    static boolean printn(boolean b){
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Int "+ PrintNumber.printn(32));
        System.out.println("byte "+ PrintNumber.printn((byte)56));
        System.out.println("short "+ PrintNumber.printn((short)33));
        System.out.println("char "+ PrintNumber.printn('n'));
        System.out.println("float "+ PrintNumber.printn(23.56f));
        System.out.println("double "+ PrintNumber.printn(56.78));
        System.out.println("long "+ PrintNumber.printn((long)85));
        System.out.println("boolean "+ PrintNumber.printn(false));
    }
}
