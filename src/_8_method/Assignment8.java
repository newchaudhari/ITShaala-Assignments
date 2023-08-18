package _8_method;

import java.util.Scanner;

public class Assignment8 {
    //Write a program which will ask the user to enter his/her marks (out of 100).
    //
    //Define a method that will display grades according to the marks entered as below:
    //
    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail
    int marks;
    void grades(int marks){
        this.marks=marks;
        if (marks<=40){
            System.out.println("Fail");
        }
        else if (marks>40 && marks<=50){
            System.out.println("DD");
        }
        else if (marks>=51 && marks<=60){
            System.out.println("CD");
        }
        else if (marks>=61 && marks<=70){
            System.out.println("BC");
        }
        else if (marks>=71 && marks<=80){
            System.out.println("BB");
        }
        else if (marks>=81 && marks<=90){
            System.out.println("AB");
        }
        else if (marks>=91 && marks<=100){
            System.out.println("AA");
        }else {
            System.out.println("Enter valid marks ");
        }
    }

    public static void main(String[] args) {
        Assignment8 s1=new Assignment8();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks between 1-100 ");
        s1.marks= scanner.nextInt();
        s1.grades(s1.marks);
    }
}
