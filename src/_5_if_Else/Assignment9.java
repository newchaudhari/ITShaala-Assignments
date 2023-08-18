package _5_if_Else;

import java.util.Scanner;

public class Assignment9 {
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

        //Modify the above question to allow student to sit if he/she has medical cause.
        // Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of classes held");
        int classesHeld= scanner.nextInt();

        System.out.println("Number of classes attended");
        int classesAttended = scanner.nextInt();

        int percentage=classesAttended*100/classesHeld;

        System.out.println("Attendance "+percentage + "%");

        System.out.println("Is medical cause y or n");
        char medicalReason = scanner.next().charAt(0);

        if (percentage>=75){
            System.out.println("You are allowed to sit in exam");
        }
        else if(percentage<75 && medicalReason == 'y'){
            System.out.println("You are allowed to sit in exam");
        }else {
            System.out.println("You are not allowed to sit in exam");
        }
    }
}
