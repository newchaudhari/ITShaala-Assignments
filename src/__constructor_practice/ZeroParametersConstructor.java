package __constructor_practice;

public class ZeroParametersConstructor {

    //Zero Parameters Constructor
    int a;
    String str;

    ZeroParametersConstructor(){
        a=15;
        str="Anil";
    }

    public static void main(String[] args) {
        ZeroParametersConstructor a1=new ZeroParametersConstructor();
        System.out.println("obj1 "+a1.a);
        System.out.println("obj1 "+a1.str);

        ZeroParametersConstructor a2=new ZeroParametersConstructor();
        System.out.println("obj2 "+a2.a);
        System.out.println("obj3 "+a2.str);
    }
}
