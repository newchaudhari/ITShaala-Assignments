package __constructor_practice;

public class ParameterisedConstructor {
    //Parameterised Constructor

    int length;
    int breadth;

    ParameterisedConstructor(int l, int b){
        length=l;
        breadth=b;
    }

    public static void main(String[] args) {
        ParameterisedConstructor a1=new ParameterisedConstructor(20,30);
        System.out.println("Length "+a1.length+"\t"+"Breadth "+a1.breadth);

        ParameterisedConstructor a2=new ParameterisedConstructor(45,25);
        System.out.println("Length "+a2.length+"\t"+"Breadth "+a2.breadth);


    }
}
