package __classAndObject_practice;

public class StudentDemo2 {
    int rollNumber = 15;
    String name ="Navin Chaudhari";
    String address ="Padalse";

    static String collageName="SSGB";

    public static void main(String[] args) {
        StudentDemo2 s1=new StudentDemo2();
        System.out.println("Roll Number: "+s1.rollNumber);//instance variable
        System.out.println("Name: "+s1.name);//instance variable
        System.out.println("Address: "+s1.address);//instance variable
        System.out.println("Collage name: "+StudentDemo2.collageName);// static variable

        System.out.println();


        //Changing the value of object
        //to change the value of object we need to take reference variable. name of variable whose value we want to change

        s1.rollNumber=20;
        s1.name="Vinit Chaudhari";
        s1.address="Bhusawal";

        System.out.println("Changed roll number: "+s1.rollNumber);
        System.out.println("Changed name: "+s1.name);
        System.out.println("Changed address: "+s1.address);
        System.out.println("Collage name: "+StudentDemo2.collageName);
        System.out.println();

        s1.rollNumber=21;
        s1.name="Anil Chaudhari";
        s1.address="Yawal";

        System.out.println("Changed roll number: "+s1.rollNumber);
        System.out.println("Changed name: "+s1.name);
        System.out.println("Changed address: "+s1.address);
        System.out.println("Collage name: "+StudentDemo2.collageName);
    }
}
