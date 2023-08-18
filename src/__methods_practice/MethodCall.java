package __methods_practice;

public class MethodCall {
    // from instance call another instance

    void m1(){
        m2();
    }
    void m2(){

    }

    // from static call another static
    static void m3(){
        //directly
        m4();

        //by using class name
        MethodCall.m4();

    }
    static void m4(){

    }

    // from instance call another static
    void m5(){
        //directly
        m6();

        //classname
        MethodCall.m6();
    }
    static void m6(){

    }

    //from static call instance method


    public static void main(String[] args) {
        MethodCall callM6=new MethodCall();
        callM6.m7();
    }
    void m7(){

    }

}
