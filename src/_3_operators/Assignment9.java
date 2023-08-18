package _3_operators;

public class Assignment9 {
    public static void main(String[] args) {
        //If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.

        int subject1=78;
        int subject2=45;
        int subject3=62;
        int totalMarksGet=subject1+subject2+subject3;
        float percentage=(totalMarksGet*100f/300f);
        System.out.println("Total Marks get "+totalMarksGet);
        System.out.println("Total Percentage get "+percentage);
    }
}
