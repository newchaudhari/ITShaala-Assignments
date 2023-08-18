package __constructor_practice;

public class Demo {
    int number1;
    String name;

    //zero parameters
    Demo(){

    }
    //one parameters
    Demo(int n){
        number1=n;

    }
    //one parameters
    Demo(String str){
        name=str;

    }
    //two parameters
    Demo(int n, String str){
        number1=n;
        name=str;

    }

    public static void main(String[] args) {
        //Zero Parameters
        Demo d1=new Demo();
        System.out.println("Zero Para: \t Number = "+d1.number1+"\t"+"Name = "+d1.name);

        //One parameters
        Demo d2=new Demo(23);
        System.out.println("One Para: \t Number = "+d2.number1);

        //One parameters
        Demo d3=new Demo("Navin");
        System.out.println("One Para: \t Name = "+d3.name);

        //Two parameters
        Demo d4=new Demo(23,"Navin");
        System.out.println("Two Para: \t Number = "+d4.number1+"\t"+"Name = "+d4.name);

        //One parameters
        Demo d5=new Demo();
        System.out.println("Zero Para: \t Number = "+d5.number1+"\t"+"Name = "+d5.name);

        //Two parameters
        Demo d6=new Demo(86,"Anil");
        System.out.println("Two Para: \t Number = "+d6.number1+"\t"+"Name = "+d6.name);

    }

}
