package __oops.interface_demo;

public interface DefaultMethod2 {
    default void m2(){

    }
    default void m3(){
        System.out.println("Default Method in Super Class of Default Method2");
    }
    default int m4(int n1, int n2){
        int multiply=n1*n2;
        System.out.println("Multiplication "+multiply);
        return multiply;


    }
}
