package _4_inputByUser;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        //If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Physics");
        int physics = scanner.nextInt();

        System.out.println("Chemistry");
        int chemistry = scanner.nextInt();

        System.out.println("Mathematics");
        int math = scanner.nextInt();

        int totalMarks=physics+chemistry+math;

        int percentageGet= totalMarks*100/300;

        System.out.println("Total marks "+totalMarks);
        System.out.println("Total percentage "+percentageGet);
    }
}
