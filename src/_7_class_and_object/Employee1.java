package _7_class_and_object;

import java.util.Scanner;

public class Employee1 {
    //1. Write a program by creating an 'Employee' class having the following methods and print the final salary.
    //    1.  '`setEmployeeInformation`()' which takes the salary, number of hours of work per day of employee as parameter
    //    2. 'addSal()' which adds $10 to salary of the employee if it is less than $500.
    //    3. 'addWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

    int salary;
    int hours;
    int days;

    void setEmployeeInformation(int sal,int h){
        salary=sal;
        hours=h;
    }
    void addSal(int sal){
        salary=sal;
        int addSalary=0;
        if (salary<500){
            addSalary=salary+10;
            System.out.println(addSalary);
        }
    }
    void addWork(int sal,int day){
        salary=sal;
        days=day;
        int addWork1;
        if (hours>6){
            addWork1=(days*5)+salary;
            System.out.println(addWork1);
        }else {
            System.out.println("Salary "+salary);
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Employee1 e1=new Employee1();
        System.out.print("Enter Salary ");
        e1.salary= scanner.nextInt();

        System.out.print("Enter hours ");
        e1.hours= scanner.nextInt();

        System.out.print("Enter days ");
        e1.days= scanner.nextInt();
        e1.addSal(e1.salary);
        e1.addWork(e1.salary, e1.days);

    }
}
