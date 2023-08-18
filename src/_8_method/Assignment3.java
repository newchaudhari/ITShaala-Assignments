package _8_method;

import java.util.Scanner;

public class Assignment3 {
    //A person is eligible to vote
    // if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    int age;
    void eligibleForVote(int age){
        this.age=age;
        if (age>=18){
            System.out.println("you are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Assignment3 vote=new Assignment3();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age ");
        vote.age= scanner.nextInt();
        vote.eligibleForVote(vote.age);
    }
}
