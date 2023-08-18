package _8_method;

public class Degree {
    //Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
    // It has two subclasses namely 'Undergraduate' and 'Postgraduate'
    // each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively.
    // Call the method by creating an object of each of the three classes.

    void getDegree(){
        System.out.println("I got degree");
        class undergraduate{
            void undergraduate(){
                System.out.println("I am an Undergraduate");


            }
        }
        undergraduate inner=new undergraduate();
        inner.undergraduate();
        class postgraduate{
            void postgraduate(){
                System.out.println("I am a Postgraduate");
            }

        }
        postgraduate inner1=new postgraduate();
        inner1.postgraduate();


    }

    public static void main(String[] args) {
        Degree demo=new Degree();
        demo.getDegree();

    }
}
