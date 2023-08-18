package __constructor_practice;

public class ConstructorChaining {
    ConstructorChaining(){
        this(10.0,20.0);
        System.out.println("zero param");
    }
    ConstructorChaining(int a){
        this(10,20);
        System.out.println("one param");
    }
    ConstructorChaining(int a, int b){
        this(10.0,20.0);
        System.out.println("two param int");
    }
    ConstructorChaining(double a, double b){
        System.out.println("two double param");
    }

    public static void main(String[] args) {
        ConstructorChaining demo = new ConstructorChaining();

    }
}
