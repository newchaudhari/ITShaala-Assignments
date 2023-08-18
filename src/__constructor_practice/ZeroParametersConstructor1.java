package __constructor_practice;

public class ZeroParametersConstructor1 {

    //Zero Parameters Constructor
    int a=13;
    String str="Navin";

    ZeroParametersConstructor1(){
        a=15;
        str="Anil";
    }

    public static void main(String[] args) {
        ZeroParametersConstructor1 a1=new ZeroParametersConstructor1();
        System.out.println("obj1 "+a1.a);
        System.out.println("obj1 "+a1.str);

        ZeroParametersConstructor1 a2=new ZeroParametersConstructor1();
        System.out.println("obj2 "+a2.a);
        System.out.println("obj3 "+a2.str);

//        System.out.println(ZeroParametersConstructor1.a);
//        System.out.println(ZeroParametersConstructor1.str);


    }
}
