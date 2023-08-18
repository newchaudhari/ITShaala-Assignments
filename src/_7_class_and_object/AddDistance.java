package _7_class_and_object;

import java.util.Scanner;

public class AddDistance {
    //Add two distances in inch-feet by creating a class named 'AddDistance'.
    int distanceInInch1;
    int distanceInInch2;
    int distanceInFeet1;
    int distanceInFeet2;

    int addInch(int i1,int i2){
        distanceInInch1=i1;
        distanceInInch2=i2;
        return distanceInInch1+distanceInInch2;
    }
    int addFeet(int f1, int f2){
        distanceInFeet1=f1;
        distanceInFeet2=f2;
        return distanceInFeet1+distanceInFeet2;
    }
    void printDistances(){
        System.out.println("Total inch "+addInch(distanceInInch1,distanceInInch2));
        System.out.println("Total feet "+addFeet(distanceInFeet1,distanceInFeet2));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter distance in inch");
        AddDistance a1=new AddDistance();

        System.out.print("i1 ");
        a1.distanceInInch1= scanner.nextInt();
        System.out.print("i2 ");
        a1.distanceInInch2= scanner.nextInt();

        System.out.println("Enter distance in Feet");
        System.out.print("f1 ");
        a1.distanceInFeet1= scanner.nextInt();
        System.out.print("f2 ");
        a1.distanceInFeet2= scanner.nextInt();
        a1.printDistances();
    }
}
