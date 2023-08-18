package _7_class_and_object;

public class Employee {
    //1. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'.
    //2. The output should be as follows:
    //Name       Year of joining        Address
    //Robert        1994             64C- WallsStreet
    //Sam           2000             68D- WallsStreet
    //John          1999            26B- WallsStreet
    String name;
    int year;
    String address;
    String yearOfJoining;

    Employee(String n, int y, String add){
        name=n;
        year=y;
        address=add;
    }
    Employee(String n, String yd, String add){
        name=n;
        yearOfJoining=yd;
        address=add;
    }

    public static void main(String[] args) {
        Employee header=new Employee("Name","Year of Joining","Address");
        System.out.println(header.name+"\t"+header.yearOfJoining+"\t \t"+header.address);

        Employee e1=new Employee("Robert",1994,"64C- WallsStreet");
        System.out.println(e1.name+"\t\t"+e1.year+"\t\t"+e1.address);

        Employee e2=new Employee("Sam",2000,"68D- WallsStreet");
        System.out.println(e2.name+"\t\t\t"+e2.year+"\t\t"+e2.address);

        Employee e3=new Employee("John",1999,"26B- WallsStreet");
        System.out.println(e3.name+"\t\t"+e3.year+"\t\t"+e3.address);
    }
}
