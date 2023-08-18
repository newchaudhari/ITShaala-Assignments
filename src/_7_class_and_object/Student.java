package _7_class_and_object;

public class Student {
    String name;
    int roll_no;
    int phone_no;
    String address;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="John";
        s1.roll_no=2;
        s1.phone_no=1234567890;
        s1.address="ABC";

        Student s2 = new Student();
        s2.name="Sam";
        s2.roll_no=3;
        s2.phone_no=1236567890;
        s2.address="XYZ";


        System.out.println("Name: "+s1.name);
        System.out.println("Roll No: "+s1.roll_no);
        System.out.println("Phone No: "+s1.phone_no);
        System.out.println("Address: "+s1.address);

        System.out.println();

        System.out.println("Name: "+s2.name);
        System.out.println("Roll No: "+s2.roll_no);
        System.out.println("Phone No: "+s2.phone_no);
        System.out.println("Address: "+s2.address);



    }
}
