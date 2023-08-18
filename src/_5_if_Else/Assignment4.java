package _5_if_Else;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        //A company decided to give bonus of 50% to employee
        // if his/her year of service is more than 5 years.
        //Ask user for their salary and year of service and print the net bonus amount.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scanner.nextInt();

        System.out.println("Enter years of service");
        int service = scanner.nextInt();

        double bonus = 0.50*salary; //convert percentage into actual amount
        double increasedSalary = salary+bonus; //total bonus get

        if (service>=5){
            System.out.println("Salary with bonus "+increasedSalary);
        }else {
            System.out.println("Salary without bonus "+salary);
        }

    }
}
