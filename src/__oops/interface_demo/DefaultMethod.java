package __oops.interface_demo;

public interface DefaultMethod {
    default void m1(){

    }
    default void m3(){
        System.out.println("Default Method in Super Class of Default Method");
    }
    default int m4(int n1, int n2){
        int sum =n1+n2;
        System.out.println("Sum "+sum);
        return sum;
    }
}
