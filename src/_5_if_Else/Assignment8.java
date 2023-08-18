package _5_if_Else;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        //A student will not be allowed to sit in exam if his/her attendance is less than 75%.
        //
        //Take following input from user
        //
        //Number of classes held
        //
        //Number of classes attended.
        //
        //And print
        //
        //percentage of class attended
        //
        //Is student is allowed to sit in exam or not.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of classes held");
        int classesHeld= scanner.nextInt();

        System.out.println("Number of classes attended");
        int classesAttended = scanner.nextInt();

        int percentage=classesAttended*100/classesHeld;

        System.out.println("Attendance "+percentage + "%");

        if (percentage>=75){
            System.out.println("You are allowed to sit in exam");
        }else {
            System.out.println("You are not allowed to sit in exam");
        }
    }
}
