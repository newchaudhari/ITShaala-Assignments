package _3_operators;

public class Assignment12 {
    public static void main(String[] args) {
        //The total number of students in a class are 90 out of which 45 are boys.
        //
        //If 50% of the total students secured grade 'A' out of which 20 are boys,
        // then write a program to calculate the total number of girls getting grade 'A'.
        int totalNoOfStudents=90;
        int boys=45;
        int securedGrades=totalNoOfStudents/2;
        int secureGradesByBoys=20;
        int secureGradesByGirls=securedGrades-secureGradesByBoys;
        System.out.println("Total no. of grade A secured by girls are "+secureGradesByGirls);

    }
}
