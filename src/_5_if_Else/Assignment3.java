package _5_if_Else;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        //
        //Ask user for quantity
        //
        //Suppose, one unit will cost 100.
        //
        //Judge and print total cost for user.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Quantity");
        int quantity = scanner.nextInt();
        double percentage =0.10*quantity;
        double totalAmount = quantity-percentage;

        if(quantity>=1000){
            System.out.println("Total amount to pay "+ totalAmount);

        }else {
            System.out.println("Purchase more than 1000 to get 10% off");
        }
    }
}
